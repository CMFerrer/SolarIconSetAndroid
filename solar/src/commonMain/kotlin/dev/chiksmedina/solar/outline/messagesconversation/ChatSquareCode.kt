package dev.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MessagesConversationGroup

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
                moveTo(10.4606f, 1.25f)
                horizontalLineTo(13.5394f)
                curveTo(15.1427f, 1.25f, 16.3997f, 1.25f, 17.4039f, 1.3455f)
                curveTo(18.4274f, 1.4428f, 19.2655f, 1.6446f, 20.0044f, 2.0973f)
                curveTo(20.7781f, 2.5714f, 21.4286f, 3.2219f, 21.9027f, 3.9956f)
                curveTo(22.3554f, 4.7344f, 22.5572f, 5.5726f, 22.6545f, 6.5961f)
                curveTo(22.75f, 7.6003f, 22.75f, 8.8573f, 22.75f, 10.4606f)
                verticalLineTo(11.5278f)
                curveTo(22.75f, 12.6691f, 22.75f, 13.564f, 22.7007f, 14.2868f)
                curveTo(22.6505f, 15.0223f, 22.5468f, 15.6344f, 22.3123f, 16.2004f)
                curveTo(21.7287f, 17.6093f, 20.6093f, 18.7287f, 19.2004f, 19.3123f)
                curveTo(18.3955f, 19.6457f, 17.4786f, 19.7197f, 16.2233f, 19.7413f)
                curveTo(15.7842f, 19.7489f, 15.5061f, 19.7545f, 15.2941f, 19.7779f)
                curveTo(15.096f, 19.7999f, 15.0192f, 19.832f, 14.9742f, 19.8582f)
                curveTo(14.9268f, 19.8857f, 14.8622f, 19.936f, 14.7501f, 20.0898f)
                curveTo(14.6287f, 20.2564f, 14.4916f, 20.4865f, 14.2742f, 20.8539f)
                lineTo(13.7321f, 21.7697f)
                curveTo(12.9585f, 23.0767f, 11.0415f, 23.0767f, 10.2679f, 21.7697f)
                lineTo(9.7258f, 20.8539f)
                curveTo(9.5084f, 20.4865f, 9.3712f, 20.2564f, 9.2499f, 20.0898f)
                curveTo(9.1377f, 19.936f, 9.0731f, 19.8857f, 9.0257f, 19.8582f)
                curveTo(8.9808f, 19.832f, 8.904f, 19.7999f, 8.7059f, 19.7779f)
                curveTo(8.4939f, 19.7545f, 8.2157f, 19.7489f, 7.7767f, 19.7413f)
                curveTo(6.5214f, 19.7197f, 5.6045f, 19.6457f, 4.7996f, 19.3123f)
                curveTo(3.3907f, 18.7287f, 2.2713f, 17.6093f, 1.6877f, 16.2004f)
                curveTo(1.4532f, 15.6344f, 1.3495f, 15.0223f, 1.2993f, 14.2868f)
                curveTo(1.25f, 13.564f, 1.25f, 12.6691f, 1.25f, 11.5278f)
                lineTo(1.25f, 10.4606f)
                curveTo(1.25f, 8.8573f, 1.25f, 7.6003f, 1.3455f, 6.5961f)
                curveTo(1.4428f, 5.5726f, 1.6446f, 4.7344f, 2.0973f, 3.9956f)
                curveTo(2.5714f, 3.2219f, 3.2219f, 2.5714f, 3.9956f, 2.0973f)
                curveTo(4.7344f, 1.6446f, 5.5726f, 1.4428f, 6.5961f, 1.3455f)
                curveTo(7.6003f, 1.25f, 8.8573f, 1.25f, 10.4606f, 1.25f)
                close()
                moveTo(6.7381f, 2.8387f)
                curveTo(5.8243f, 2.9256f, 5.2429f, 3.0922f, 4.7794f, 3.3763f)
                curveTo(4.2075f, 3.7267f, 3.7267f, 4.2075f, 3.3763f, 4.7794f)
                curveTo(3.0922f, 5.2429f, 2.9256f, 5.8243f, 2.8387f, 6.7381f)
                curveTo(2.7508f, 7.663f, 2.75f, 8.8488f, 2.75f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(2.75f, 12.6751f, 2.7504f, 13.5189f, 2.7958f, 14.1847f)
                curveTo(2.8408f, 14.8438f, 2.9274f, 15.2736f, 3.0735f, 15.6264f)
                curveTo(3.5049f, 16.6678f, 4.3322f, 17.4951f, 5.3736f, 17.9265f)
                curveTo(5.8892f, 18.1401f, 6.5471f, 18.2199f, 7.8025f, 18.2416f)
                lineTo(7.8343f, 18.2421f)
                curveTo(8.2323f, 18.249f, 8.5811f, 18.2549f, 8.871f, 18.287f)
                curveTo(9.1825f, 18.3215f, 9.4871f, 18.3912f, 9.7799f, 18.5615f)
                curveTo(10.0702f, 18.7304f, 10.2795f, 18.9559f, 10.4621f, 19.2063f)
                curveTo(10.6307f, 19.4378f, 10.804f, 19.7306f, 11.0004f, 20.0623f)
                lineTo(11.5587f, 21.0057f)
                curveTo(11.7515f, 21.3313f, 12.2485f, 21.3313f, 12.4412f, 21.0057f)
                lineTo(12.9996f, 20.0623f)
                curveTo(13.1959f, 19.7306f, 13.3692f, 19.4378f, 13.5379f, 19.2063f)
                curveTo(13.7204f, 18.9559f, 13.9298f, 18.7304f, 14.2201f, 18.5615f)
                curveTo(14.5129f, 18.3912f, 14.8175f, 18.3215f, 15.129f, 18.287f)
                curveTo(15.4189f, 18.2549f, 15.7676f, 18.249f, 16.1656f, 18.2421f)
                lineTo(16.1975f, 18.2416f)
                curveTo(17.4529f, 18.2199f, 18.1108f, 18.1401f, 18.6264f, 17.9265f)
                curveTo(19.6678f, 17.4951f, 20.4951f, 16.6678f, 20.9265f, 15.6264f)
                curveTo(21.0726f, 15.2736f, 21.1592f, 14.8438f, 21.2042f, 14.1847f)
                curveTo(21.2496f, 13.5189f, 21.25f, 12.6751f, 21.25f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(21.25f, 8.8488f, 21.2492f, 7.663f, 21.1613f, 6.7381f)
                curveTo(21.0744f, 5.8243f, 20.9078f, 5.2429f, 20.6237f, 4.7794f)
                curveTo(20.2733f, 4.2075f, 19.7925f, 3.7267f, 19.2206f, 3.3763f)
                curveTo(18.7571f, 3.0922f, 18.1757f, 2.9256f, 17.2619f, 2.8387f)
                curveTo(16.337f, 2.7508f, 15.1512f, 2.75f, 13.5f, 2.75f)
                horizontalLineTo(10.5f)
                curveTo(8.8488f, 2.75f, 7.663f, 2.7508f, 6.7381f, 2.8387f)
                close()
                moveTo(13.4881f, 5.2756f)
                curveTo(13.8882f, 5.3828f, 14.1256f, 5.794f, 14.0184f, 6.1941f)
                lineTo(11.4302f, 15.8534f)
                curveTo(11.323f, 16.2535f, 10.9117f, 16.4909f, 10.5116f, 16.3837f)
                curveTo(10.1115f, 16.2765f, 9.8741f, 15.8652f, 9.9813f, 15.4651f)
                lineTo(12.5695f, 5.8059f)
                curveTo(12.6767f, 5.4058f, 13.088f, 5.1684f, 13.4881f, 5.2756f)
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
                lineTo(7.7613f, 14.1516f)
                curveTo(7.126f, 13.5163f, 6.5962f, 12.9865f, 6.2322f, 12.5094f)
                curveTo(5.8479f, 12.0058f, 5.5784f, 11.4737f, 5.5784f, 10.8296f)
                curveTo(5.5784f, 10.1855f, 5.8479f, 9.6534f, 6.2322f, 9.1498f)
                curveTo(6.5962f, 8.6727f, 7.126f, 8.1429f, 7.7613f, 7.5076f)
                lineTo(7.9697f, 7.2993f)
                curveTo(8.2626f, 7.0064f, 8.7374f, 7.0064f, 9.0303f, 7.2993f)
                close()
                moveTo(14.9697f, 7.2993f)
                curveTo(15.2626f, 7.0064f, 15.7374f, 7.0064f, 16.0303f, 7.2993f)
                lineTo(16.2387f, 7.5076f)
                curveTo(16.874f, 8.1429f, 17.4038f, 8.6727f, 17.7678f, 9.1498f)
                curveTo(18.1521f, 9.6534f, 18.4216f, 10.1855f, 18.4216f, 10.8296f)
                curveTo(18.4216f, 11.4737f, 18.1521f, 12.0058f, 17.7678f, 12.5094f)
                curveTo(17.4038f, 12.9865f, 16.874f, 13.5163f, 16.2386f, 14.1516f)
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
            }
        }
            .build()
        return _chatSquareCode!!
    }

private var _chatSquareCode: ImageVector? = null
