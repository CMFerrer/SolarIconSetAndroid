package com.chiksmedina.solar.linear.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.CallGroup

public val CallGroup.EndCall: ImageVector
    get() {
        if (_endCall != null) {
            return _endCall!!
        }
        _endCall = Builder(name = "EndCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.8618f)
                lineTo(7.25f, 12.8618f)
                lineTo(7.25f, 12.8618f)
                lineTo(8.0f, 12.8618f)
                close()
                moveTo(8.0f, 13.4783f)
                lineTo(8.75f, 13.4783f)
                lineTo(8.75f, 13.4783f)
                lineTo(8.0f, 13.4783f)
                close()
                moveTo(6.58f, 15.3296f)
                lineTo(6.3691f, 14.6099f)
                lineTo(6.3691f, 14.6099f)
                lineTo(6.58f, 15.3296f)
                close()
                moveTo(4.58f, 15.9157f)
                lineTo(4.3691f, 15.196f)
                lineTo(4.3691f, 15.196f)
                lineTo(4.58f, 15.9157f)
                close()
                moveTo(2.0f, 14.0645f)
                lineTo(2.75f, 14.0645f)
                lineTo(2.0f, 14.0645f)
                close()
                moveTo(2.0f, 12.1416f)
                lineTo(2.75f, 12.1416f)
                lineTo(2.0f, 12.1416f)
                close()
                moveTo(2.4408f, 10.789f)
                lineTo(1.8633f, 10.3105f)
                lineTo(1.8633f, 10.3105f)
                lineTo(2.4408f, 10.789f)
                close()
                moveTo(12.0f, 7.0001f)
                lineTo(12.0f, 7.7501f)
                lineTo(12.0f, 7.0001f)
                close()
                moveTo(21.3703f, 9.8561f)
                lineTo(21.8699f, 9.2967f)
                lineTo(21.8699f, 9.2967f)
                lineTo(21.3703f, 9.8561f)
                close()
                moveTo(16.0f, 13.2501f)
                lineTo(15.25f, 13.2501f)
                lineTo(15.25f, 13.2501f)
                lineTo(16.0f, 13.2501f)
                close()
                moveTo(17.7004f, 15.1626f)
                lineTo(17.5916f, 15.9047f)
                lineTo(17.5916f, 15.9047f)
                lineTo(17.7004f, 15.1626f)
                close()
                moveTo(19.7004f, 15.4557f)
                lineTo(19.8091f, 14.7136f)
                lineTo(19.8091f, 14.7136f)
                lineTo(19.7004f, 15.4557f)
                close()
                moveTo(22.0f, 13.5431f)
                lineTo(21.25f, 13.5431f)
                lineTo(21.25f, 13.5431f)
                lineTo(22.0f, 13.5431f)
                close()
                moveTo(22.0f, 11.4184f)
                lineTo(22.75f, 11.4184f)
                lineTo(22.75f, 11.4184f)
                lineTo(22.0f, 11.4184f)
                close()
                moveTo(12.0f, 11.3964f)
                lineTo(12.0f, 10.6464f)
                lineTo(12.0f, 11.3964f)
                close()
                moveTo(7.25f, 12.8618f)
                lineTo(7.25f, 13.4783f)
                lineTo(8.75f, 13.4783f)
                lineTo(8.75f, 12.8618f)
                lineTo(7.25f, 12.8618f)
                close()
                moveTo(6.3691f, 14.6099f)
                lineTo(4.3691f, 15.196f)
                lineTo(4.7909f, 16.6354f)
                lineTo(6.7909f, 16.0493f)
                lineTo(6.3691f, 14.6099f)
                close()
                moveTo(2.75f, 14.0645f)
                lineTo(2.75f, 12.1416f)
                lineTo(1.25f, 12.1416f)
                lineTo(1.25f, 14.0645f)
                lineTo(2.75f, 14.0645f)
                close()
                moveTo(3.0183f, 11.2675f)
                curveTo(3.9018f, 10.2013f, 6.5132f, 7.7501f, 12.0f, 7.7501f)
                lineTo(12.0f, 6.2501f)
                curveTo(5.9896f, 6.2501f, 2.9787f, 8.9643f, 1.8633f, 10.3105f)
                lineTo(3.0183f, 11.2675f)
                close()
                moveTo(12.0f, 7.7501f)
                curveTo(17.233f, 7.7501f, 19.8648f, 9.5172f, 20.8708f, 10.4155f)
                lineTo(21.8699f, 9.2967f)
                curveTo(20.5944f, 8.1577f, 17.6087f, 6.2501f, 12.0f, 6.2501f)
                lineTo(12.0f, 7.7501f)
                close()
                moveTo(15.25f, 12.8618f)
                verticalLineTo(13.2501f)
                horizontalLineTo(16.75f)
                verticalLineTo(12.8618f)
                horizontalLineTo(15.25f)
                close()
                moveTo(17.5916f, 15.9047f)
                lineTo(19.5916f, 16.1978f)
                lineTo(19.8091f, 14.7136f)
                lineTo(17.8091f, 14.4205f)
                lineTo(17.5916f, 15.9047f)
                close()
                moveTo(22.75f, 13.5431f)
                verticalLineTo(11.4184f)
                horizontalLineTo(21.25f)
                verticalLineTo(13.5431f)
                horizontalLineTo(22.75f)
                close()
                moveTo(16.0f, 12.8618f)
                curveTo(16.75f, 12.8618f, 16.75f, 12.8608f, 16.75f, 12.8598f)
                curveTo(16.75f, 12.8595f, 16.75f, 12.8584f, 16.75f, 12.8578f)
                curveTo(16.75f, 12.8564f, 16.75f, 12.855f, 16.75f, 12.8535f)
                curveTo(16.7499f, 12.8506f, 16.7499f, 12.8476f, 16.7498f, 12.8445f)
                curveTo(16.7497f, 12.8383f, 16.7495f, 12.8317f, 16.7492f, 12.8246f)
                curveTo(16.7485f, 12.8105f, 16.7475f, 12.7948f, 16.7459f, 12.7774f)
                curveTo(16.7428f, 12.7427f, 16.7374f, 12.7017f, 16.7283f, 12.6553f)
                curveTo(16.7102f, 12.5624f, 16.6776f, 12.4485f, 16.6202f, 12.3223f)
                curveTo(16.503f, 12.0647f, 16.2941f, 11.7812f, 15.9433f, 11.5241f)
                curveTo(15.2573f, 11.0215f, 14.0694f, 10.6464f, 12.0f, 10.6464f)
                lineTo(12.0f, 12.1464f)
                curveTo(13.9306f, 12.1464f, 14.7427f, 12.504f, 15.0567f, 12.7341f)
                curveTo(15.2059f, 12.8434f, 15.247f, 12.9263f, 15.2548f, 12.9434f)
                curveTo(15.2599f, 12.9546f, 15.2586f, 12.9552f, 15.256f, 12.9424f)
                curveTo(15.2548f, 12.9361f, 15.2533f, 12.9266f, 15.2521f, 12.9133f)
                curveTo(15.2515f, 12.9067f, 15.251f, 12.8992f, 15.2506f, 12.8906f)
                curveTo(15.2504f, 12.8863f, 15.2503f, 12.8818f, 15.2502f, 12.877f)
                curveTo(15.2501f, 12.8746f, 15.2501f, 12.8722f, 15.25f, 12.8696f)
                curveTo(15.25f, 12.8684f, 15.25f, 12.8671f, 15.25f, 12.8658f)
                curveTo(15.25f, 12.8651f, 15.25f, 12.8641f, 15.25f, 12.8638f)
                curveTo(15.25f, 12.8628f, 15.25f, 12.8618f, 16.0f, 12.8618f)
                close()
                moveTo(12.0f, 10.6464f)
                curveTo(9.9306f, 10.6464f, 8.7427f, 11.0215f, 8.0567f, 11.5241f)
                curveTo(7.7059f, 11.7812f, 7.497f, 12.0647f, 7.3798f, 12.3223f)
                curveTo(7.3224f, 12.4485f, 7.2898f, 12.5624f, 7.2717f, 12.6553f)
                curveTo(7.2626f, 12.7017f, 7.2572f, 12.7427f, 7.2541f, 12.7774f)
                curveTo(7.2525f, 12.7948f, 7.2515f, 12.8105f, 7.2509f, 12.8246f)
                curveTo(7.2505f, 12.8317f, 7.2503f, 12.8383f, 7.2502f, 12.8445f)
                curveTo(7.2501f, 12.8476f, 7.2501f, 12.8506f, 7.25f, 12.8535f)
                curveTo(7.25f, 12.855f, 7.25f, 12.8564f, 7.25f, 12.8578f)
                curveTo(7.25f, 12.8585f, 7.25f, 12.8595f, 7.25f, 12.8598f)
                curveTo(7.25f, 12.8608f, 7.25f, 12.8618f, 8.0f, 12.8618f)
                curveTo(8.75f, 12.8618f, 8.75f, 12.8628f, 8.75f, 12.8638f)
                curveTo(8.75f, 12.8641f, 8.75f, 12.8651f, 8.75f, 12.8658f)
                curveTo(8.75f, 12.8671f, 8.75f, 12.8684f, 8.75f, 12.8696f)
                curveTo(8.7499f, 12.8722f, 8.7499f, 12.8746f, 8.7498f, 12.877f)
                curveTo(8.7497f, 12.8818f, 8.7496f, 12.8863f, 8.7494f, 12.8906f)
                curveTo(8.749f, 12.8992f, 8.7485f, 12.9067f, 8.7479f, 12.9133f)
                curveTo(8.7467f, 12.9266f, 8.7452f, 12.9361f, 8.7439f, 12.9424f)
                curveTo(8.7415f, 12.9552f, 8.7401f, 12.9546f, 8.7452f, 12.9434f)
                curveTo(8.753f, 12.9263f, 8.7941f, 12.8434f, 8.9433f, 12.7341f)
                curveTo(9.2573f, 12.504f, 10.0694f, 12.1464f, 12.0f, 12.1464f)
                lineTo(12.0f, 10.6464f)
                close()
                moveTo(19.5916f, 16.1978f)
                curveTo(21.2257f, 16.4372f, 22.75f, 15.2129f, 22.75f, 13.5431f)
                lineTo(21.25f, 13.5431f)
                curveTo(21.25f, 14.2407f, 20.5953f, 14.8288f, 19.8091f, 14.7136f)
                lineTo(19.5916f, 16.1978f)
                close()
                moveTo(20.8708f, 10.4155f)
                curveTo(21.1133f, 10.6321f, 21.25f, 10.9779f, 21.25f, 11.4184f)
                lineTo(22.75f, 11.4184f)
                curveTo(22.75f, 10.6849f, 22.5191f, 9.8765f, 21.8699f, 9.2967f)
                lineTo(20.8708f, 10.4155f)
                close()
                moveTo(2.75f, 12.1416f)
                curveTo(2.75f, 11.7742f, 2.8435f, 11.4786f, 3.0183f, 11.2675f)
                lineTo(1.8633f, 10.3105f)
                curveTo(1.4059f, 10.8625f, 1.25f, 11.531f, 1.25f, 12.1416f)
                lineTo(2.75f, 12.1416f)
                close()
                moveTo(15.25f, 13.2501f)
                curveTo(15.25f, 14.5972f, 16.2642f, 15.7102f, 17.5916f, 15.9047f)
                lineTo(17.8091f, 14.4205f)
                curveTo(17.1811f, 14.3285f, 16.75f, 13.8158f, 16.75f, 13.2501f)
                lineTo(15.25f, 13.2501f)
                close()
                moveTo(4.3691f, 15.196f)
                curveTo(3.5319f, 15.4413f, 2.75f, 14.8282f, 2.75f, 14.0645f)
                lineTo(1.25f, 14.0645f)
                curveTo(1.25f, 15.8967f, 3.0593f, 17.1429f, 4.7909f, 16.6354f)
                lineTo(4.3691f, 15.196f)
                close()
                moveTo(7.25f, 13.4783f)
                curveTo(7.25f, 13.9834f, 6.9067f, 14.4523f, 6.3691f, 14.6099f)
                lineTo(6.7909f, 16.0493f)
                curveTo(7.9399f, 15.7126f, 8.75f, 14.6778f, 8.75f, 13.4783f)
                lineTo(7.25f, 13.4783f)
                close()
            }
        }
        .build()
        return _endCall!!
    }

private var _endCall: ImageVector? = null