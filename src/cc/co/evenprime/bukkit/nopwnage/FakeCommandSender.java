package cc.co.evenprime.bukkit.nopwnage;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.PermissibleBase;
import org.bukkit.permissions.ServerOperator;


public class FakeCommandSender extends PermissibleBase implements CommandSender
{
    private String name;
    
    private static final ServerOperator serverOperator = new ServerOperator () {
        @Override
        public boolean isOp()
        {
            return true;
        }

        @Override
        public void setOp(boolean value) {}
    };

    public FakeCommandSender(String name)
    {
        super(serverOperator);
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void sendMessage(String string)
    {
    }
    
    @Override
    public void sendMessage(String[] string)
    {
    }

    @Override
    public Server getServer()
    {
        return Bukkit.getServer();
    }
}