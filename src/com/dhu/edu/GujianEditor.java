package com.dhu.edu;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ƹŽ���̷ 1.71�浵�޸��� ���²����� �������ݴ����²� �ƺ�����
 * 
 * @author Home
 *
 */
public class GujianEditor {
	/**
	 * ��raf��ǰָ��λ�õ�str.length�Ƚ���str�Ƿ�һ��
	 * 
	 * @param raf
	 * @param str
	 * @return
	 * @throws IOException
	 */
	public static boolean hasString(RandomAccessFile raf, String str)
			throws IOException {
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) != raf.readByte())
				return false;
		return true;
	}

	/**
	 * ��raf�����ȡָ�����ȵ��ַ���
	 * 
	 * @param raf
	 * @param length
	 * @return
	 * @throws IOException
	 */
	public static String getString(RandomAccessFile raf, int length)
			throws IOException {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++)
			sb.append((char) raf.read());
		return sb.toString();
	}

	/**
	 * �ж϶�ȡ���ֽ��Ƿ����/[0-9]{2}BK/����ַ��������˲²⣬�ƺ��й��ɣ�
	 * 
	 * @param b
	 * @return
	 */
	public static boolean validate4Byte(byte[] b) {
		return (b.length == 4) && b[0] >= '0' && b[0] <= '9' && b[1] >= '0'
				&& b[1] <= '9' && b[2] == 'B' && b[3] == 'K';
	}

	/**
	 * �Ե͵�ַ��λ��ʽ��ȡ���ֽ�����
	 * 
	 * @param raf
	 * @return
	 * @throws IOException
	 */
	public static int myReadInt(RandomAccessFile raf) throws IOException {
		int ch1 = raf.read();
		int ch2 = raf.read();
		int ch3 = raf.read();
		int ch4 = raf.read();
		if ((ch1 | ch2 | ch3 | ch4) < 0)
			throw new EOFException();
		return ((ch1 << 0) + (ch2 << 8) + (ch3 << 16) + (ch4 << 24));
	}

	/**
	 * ��byte����ת����String
	 * 
	 * @param b
	 * @return
	 */
	public static String byte2String(byte[] b) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < b.length; i++)
			sb.append((char) b[i]);
		return sb.toString();
	}

	/**
	 * ������һ�������������� ��һ������Ϊ�ļ�λ�� �ڶ������� -m ʵ���� -a ȫ��Ʒ
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 1 || args.length > 2)
			return;
		int c;
		boolean ok = false;
		byte[] fourByte = new byte[4];
		long pos = 0;
		int strLen;
		int magic_num = 2;
		String nodeName;
		try {
			RandomAccessFile raf = new RandomAccessFile(args[0], "rw");

			for (c = raf.read(); c != -1; c = raf.read()) {
				if (c == 'K') {
					pos = raf.getFilePointer() - 1;
					raf.seek(pos);
					if (hasString(raf, "KitBag")) {
						ok = true;
						break;
					}
				}
			}
			if (!ok) {
				System.out.println("No found");
			} else {
				// System.out.printf("%X\n", pos);
				raf.seek(pos + 6);
				// System.out.printf("%X\n", raf.getFilePointer());

				int total = 0;
				for (raf.read(fourByte); validate4Byte(fourByte); raf
						.read(fourByte)) {
					nodeName = byte2String(fourByte);
					System.out.print("Node:" + nodeName);
					int nodeNumber = myReadInt(raf);
					System.out.println(" has " + nodeNumber + " elements.");
					total += nodeNumber;
					for (int i = 0; i < nodeNumber; i++) {
						strLen = myReadInt(raf);
						if (strLen > 0xa)
							break;
						String item_id = getString(raf, strLen - 5);
						raf.seek(raf.getFilePointer() + 9);
						// long item_num_addr = raf.getFilePointer();
						int item_num = raf.read();
						if (args.length == 2 && args[1].equals("-m")) {
							if (magic_num < 100
									&& item_num >= 0
									&& String
											.valueOf(
													GujianItemUtil.itemMap
															.get(item_id))
											.equalsIgnoreCase("null")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(magic_num++);
							} else if (item_num > 0
									&& !String
											.valueOf(
													GujianItemUtil.itemMap
															.get(item_id))
											.equalsIgnoreCase("null")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(1);
							}
						} else if (args.length == 2 && args[1].equals("-a")) {
							if (nodeName.equals("70BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(88);
							} else if (nodeName.equals("80BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(88);
							} else if (nodeName.equals("90BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(88);
							} else if (nodeName.equals("01BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(88);
							} else if (nodeName.equals("21BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(33);
							} else if (nodeName.equals("31BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(6);
							} else if (nodeName.equals("41BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(6);
							} else if (nodeName.equals("51BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(6);
							} else if (nodeName.equals("61BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(6);
							} else if (nodeName.equals("71BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(6);
							} else if (nodeName.equals("81BK")) {
								raf.seek(raf.getFilePointer() - 1);
								raf.write(3);
							}

						}
						System.out.printf("id:%s\tnum:%d\tdes:%s\n", item_id,
								item_num, String.valueOf(GujianItemUtil.itemMap
										.get(item_id)));
						raf.seek(raf.getFilePointer() + 15);
					}
				}
				System.out.println("=======\nTotal number of nodes:" + total);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("OK");
	}
}
