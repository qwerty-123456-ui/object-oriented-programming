class CommandLineException extends Exception
{
        CommandLineException(String s)
        {
                super(s);
        }
}
class CmdEX
{
        public static void main(String[]args)
        {
                try
                {
                        if(args.length<3)
                        {
                                throw new CommandLineException("Command line arguments are less than three");
                        }
			else
				System.out.println("chill...no exeception");
                }
                catch(CommandLineException e)
                {
                        System.out.println("EXception raised: "+e);
                }
		//else
                  //              System.out.println("chill...no exeception");  error
        }
}

