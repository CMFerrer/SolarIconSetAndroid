package dev.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.ChatSquareCode: ImageVector
    get() {
        if (_chatSquareCode != null) {
            return _chatSquareCode!!
        }
        _chatSquareCode = Builder(
            name = "ChatSquareCode", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.0867f, 21.3877f)
                lineTo(13.6288f, 20.4718f)
                curveTo(14.0492f, 19.7614f, 14.2595f, 19.4062f, 14.5972f, 19.2098f)
                curveTo(14.9349f, 19.0134f, 15.36f, 19.0061f, 16.2104f, 18.9915f)
                curveTo(17.4658f, 18.9698f, 18.2531f, 18.8929f, 18.9134f, 18.6194f)
                curveTo(20.1386f, 18.1119f, 21.1119f, 17.1386f, 21.6194f, 15.9134f)
                curveTo(22.0f, 14.9946f, 22.0f, 13.8297f, 22.0f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(22.0f, 7.2266f, 22.0f, 5.5898f, 21.2632f, 4.3875f)
                curveTo(20.8509f, 3.7147f, 20.2853f, 3.1491f, 19.6125f, 2.7368f)
                curveTo(18.4101f, 2.0f, 16.7734f, 2.0f, 13.5f, 2.0f)
                horizontalLineTo(10.5f)
                curveTo(7.2266f, 2.0f, 5.5898f, 2.0f, 4.3875f, 2.7368f)
                curveTo(3.7147f, 3.1491f, 3.1491f, 3.7147f, 2.7368f, 4.3875f)
                curveTo(2.0f, 5.5898f, 2.0f, 7.2266f, 2.0f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(2.0f, 13.8297f, 2.0f, 14.9946f, 2.3806f, 15.9134f)
                curveTo(2.8881f, 17.1386f, 3.8614f, 18.1119f, 5.0866f, 18.6194f)
                curveTo(5.7469f, 18.8929f, 6.5342f, 18.9698f, 7.7896f, 18.9915f)
                curveTo(8.6399f, 19.0061f, 9.0651f, 19.0134f, 9.4028f, 19.2098f)
                curveTo(9.7405f, 19.4063f, 9.9507f, 19.7614f, 10.3712f, 20.4718f)
                lineTo(10.9133f, 21.3877f)
                curveTo(11.3965f, 22.204f, 12.6035f, 22.204f, 13.0867f, 21.3877f)
                close()
                moveTo(14.9697f, 7.2993f)
                curveTo(15.2626f, 7.0064f, 15.7374f, 7.0064f, 16.0303f, 7.2993f)
                lineTo(16.2387f, 7.5076f)
                curveTo(16.874f, 8.1429f, 17.4038f, 8.6727f, 17.7678f, 9.1498f)
                curveTo(18.1521f, 9.6534f, 18.4216f, 10.1855f, 18.4216f, 10.8296f)
                curveTo(18.4216f, 11.4737f, 18.1521f, 12.0058f, 17.7678f, 12.5094f)
                curveTo(17.4038f, 12.9865f, 16.874f, 13.5163f, 16.2387f, 14.1516f)
                lineTo(16.0303f, 14.3599f)
                curveTo(15.7374f, 14.6528f, 15.2626f, 14.6528f, 14.9697f, 14.3599f)
                curveTo(14.6768f, 14.067f, 14.6768f, 13.5922f, 14.9697f, 13.2993f)
                lineTo(15.1412f, 13.1277f)
                curveTo(15.8229f, 12.446f, 16.2797f, 11.987f, 16.5753f, 11.5995f)
                curveTo(16.8577f, 11.2294f, 16.9216f, 11.0139f, 16.9216f, 10.8296f)
                curveTo(16.9216f, 10.6453f, 16.8577f, 10.4298f, 16.5753f, 10.0597f)
                curveTo(16.2797f, 9.6722f, 15.8229f, 9.2132f, 15.1412f, 8.5315f)
                lineTo(14.9697f, 8.3599f)
                curveTo(14.6768f, 8.067f, 14.6768f, 7.5922f, 14.9697f, 7.2993f)
                close()
                moveTo(14.0184f, 6.1941f)
                curveTo(14.1256f, 5.794f, 13.8882f, 5.3828f, 13.4881f, 5.2756f)
                curveTo(13.088f, 5.1684f, 12.6767f, 5.4058f, 12.5695f, 5.8059f)
                lineTo(9.9813f, 15.4651f)
                curveTo(9.8741f, 15.8652f, 10.1115f, 16.2765f, 10.5116f, 16.3837f)
                curveTo(10.9117f, 16.4909f, 11.323f, 16.2535f, 11.4302f, 15.8534f)
                lineTo(14.0184f, 6.1941f)
                close()
                moveTo(9.0303f, 7.2993f)
                curveTo(9.3232f, 7.5922f, 9.3232f, 8.067f, 9.0303f, 8.3599f)
                lineTo(8.8588f, 8.5315f)
                curveTo(8.1771f, 9.2132f, 7.7203f, 9.6722f, 7.4247f, 10.0597f)
                curveTo(7.1423f, 10.4298f, 7.0784f, 10.6453f, 7.0784f, 10.8296f)
                curveTo(7.0784f, 11.0139f, 7.1423f, 11.2294f, 7.4247f, 11.5995f)
                curveTo(7.7203f, 11.987f, 8.1771f, 12.446f, 8.8588f, 13.1277f)
                lineTo(9.0303f, 13.2993f)
                curveTo(9.3232f, 13.5922f, 9.3232f, 14.067f, 9.0303f, 14.3599f)
                curveTo(8.7374f, 14.6528f, 8.2626f, 14.6528f, 7.9697f, 14.3599f)
                lineTo(7.7981f, 14.1883f)
                lineTo(7.7613f, 14.1516f)
                curveTo(7.126f, 13.5163f, 6.5962f, 12.9865f, 6.2322f, 12.5094f)
                curveTo(5.8479f, 12.0058f, 5.5784f, 11.4737f, 5.5784f, 10.8296f)
                curveTo(5.5784f, 10.1855f, 5.8479f, 9.6534f, 6.2322f, 9.1498f)
                curveTo(6.5962f, 8.6727f, 7.126f, 8.1429f, 7.7613f, 7.5076f)
                lineTo(7.7981f, 7.4708f)
                lineTo(7.9697f, 7.2993f)
                curveTo(8.2626f, 7.0064f, 8.7374f, 7.0064f, 9.0303f, 7.2993f)
                close()
            }
        }
            .build()
        return _chatSquareCode!!
    }

private var _chatSquareCode: ImageVector? = null
