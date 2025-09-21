package dev.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.SmartphoneUpdate: ImageVector
    get() {
        if (_smartphoneUpdate != null) {
            return _smartphoneUpdate!!
        }
        _smartphoneUpdate = Builder(
            name = "SmartphoneUpdate", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero
                ) {
                    moveTo(20.0f, 10.0f)
                    curveTo(20.0f, 6.2288f, 20.0f, 4.3432f, 18.8284f, 3.1716f)
                    curveTo(17.7653f, 2.1085f, 16.1143f, 2.0101f, 13.0f, 2.001f)
                    moveTo(20.0f, 14.0f)
                    curveTo(20.0f, 17.7713f, 20.0f, 19.6569f, 18.8284f, 20.8285f)
                    curveTo(17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f, 22.0f)
                    curveTo(8.2288f, 22.0f, 6.3432f, 22.0f, 5.1716f, 20.8285f)
                    curveTo(4.0f, 19.6569f, 4.0f, 17.7713f, 4.0f, 14.0f)
                    verticalLineTo(11.001f)
                }
                path(
                    fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(2.7302f, 4.0f)
                    lineTo(1.9802f, 4.0f)
                    lineTo(1.9802f, 4.0f)
                    lineTo(2.7302f, 4.0f)
                    close()
                    moveTo(2.7302f, 4.8f)
                    lineTo(2.1762f, 5.3056f)
                    curveTo(2.3183f, 5.4613f, 2.5194f, 5.55f, 2.7302f, 5.55f)
                    curveTo(2.941f, 5.55f, 3.142f, 5.4613f, 3.2841f, 5.3056f)
                    lineTo(2.7302f, 4.8f)
                    close()
                    moveTo(4.0143f, 4.5056f)
                    curveTo(4.2935f, 4.1997f, 4.2719f, 3.7253f, 3.9659f, 3.446f)
                    curveTo(3.66f, 3.1668f, 3.1856f, 3.1885f, 2.9064f, 3.4944f)
                    lineTo(4.0143f, 4.5056f)
                    close()
                    moveTo(2.554f, 3.4944f)
                    curveTo(2.2747f, 3.1885f, 1.8003f, 3.1668f, 1.4944f, 3.446f)
                    curveTo(1.1885f, 3.7253f, 1.1668f, 4.1997f, 1.446f, 4.5056f)
                    lineTo(2.554f, 3.4944f)
                    close()
                    moveTo(10.2698f, 3.2f)
                    lineTo(10.8238f, 2.6944f)
                    curveTo(10.6817f, 2.5387f, 10.4806f, 2.45f, 10.2698f, 2.45f)
                    curveTo(10.059f, 2.45f, 9.858f, 2.5387f, 9.7159f, 2.6944f)
                    lineTo(10.2698f, 3.2f)
                    close()
                    moveTo(8.9857f, 3.4944f)
                    curveTo(8.7065f, 3.8003f, 8.7281f, 4.2747f, 9.0341f, 4.554f)
                    curveTo(9.34f, 4.8332f, 9.8144f, 4.8115f, 10.0936f, 4.5056f)
                    lineTo(8.9857f, 3.4944f)
                    close()
                    moveTo(10.446f, 4.5056f)
                    curveTo(10.7253f, 4.8115f, 11.1997f, 4.8332f, 11.5056f, 4.554f)
                    curveTo(11.8115f, 4.2747f, 11.8332f, 3.8003f, 11.554f, 3.4944f)
                    lineTo(10.446f, 4.5056f)
                    close()
                    moveTo(4.5764f, 6.3062f)
                    curveTo(4.2993f, 5.9982f, 3.8251f, 5.9732f, 3.5172f, 6.2502f)
                    curveTo(3.2092f, 6.5272f, 3.1842f, 7.0014f, 3.4612f, 7.3094f)
                    lineTo(4.5764f, 6.3062f)
                    close()
                    moveTo(8.5397f, 1.8305f)
                    curveTo(8.7988f, 2.1536f, 9.2708f, 2.2056f, 9.594f, 1.9465f)
                    curveTo(9.9171f, 1.6874f, 9.9691f, 1.2154f, 9.71f, 0.8922f)
                    lineTo(8.5397f, 1.8305f)
                    close()
                    moveTo(6.381f, -0.75f)
                    curveTo(3.8875f, -0.75f, 1.9802f, 1.4426f, 1.9802f, 4.0f)
                    horizontalLineTo(3.4802f)
                    curveTo(3.4802f, 2.1391f, 4.8419f, 0.75f, 6.381f, 0.75f)
                    verticalLineTo(-0.75f)
                    close()
                    moveTo(1.9802f, 4.0f)
                    lineTo(1.9802f, 4.8f)
                    lineTo(3.4802f, 4.8f)
                    lineTo(3.4802f, 4.0f)
                    lineTo(1.9802f, 4.0f)
                    close()
                    moveTo(3.2841f, 5.3056f)
                    lineTo(4.0143f, 4.5056f)
                    lineTo(2.9064f, 3.4944f)
                    lineTo(2.1762f, 4.2944f)
                    lineTo(3.2841f, 5.3056f)
                    close()
                    moveTo(3.2841f, 4.2944f)
                    lineTo(2.554f, 3.4944f)
                    lineTo(1.446f, 4.5056f)
                    lineTo(2.1762f, 5.3056f)
                    lineTo(3.2841f, 4.2944f)
                    close()
                    moveTo(6.619f, 8.75f)
                    curveTo(9.1125f, 8.75f, 11.0198f, 6.5574f, 11.0198f, 4.0f)
                    horizontalLineTo(9.5198f)
                    curveTo(9.5198f, 5.8609f, 8.1581f, 7.25f, 6.619f, 7.25f)
                    verticalLineTo(8.75f)
                    close()
                    moveTo(11.0198f, 4.0f)
                    verticalLineTo(3.2f)
                    horizontalLineTo(9.5198f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(11.0198f)
                    close()
                    moveTo(9.7159f, 2.6944f)
                    lineTo(8.9857f, 3.4944f)
                    lineTo(10.0936f, 4.5056f)
                    lineTo(10.8238f, 3.7056f)
                    lineTo(9.7159f, 2.6944f)
                    close()
                    moveTo(9.7159f, 3.7056f)
                    lineTo(10.446f, 4.5056f)
                    lineTo(11.554f, 3.4944f)
                    lineTo(10.8238f, 2.6944f)
                    lineTo(9.7159f, 3.7056f)
                    close()
                    moveTo(3.4612f, 7.3094f)
                    curveTo(4.2515f, 8.1878f, 5.3685f, 8.75f, 6.619f, 8.75f)
                    verticalLineTo(7.25f)
                    curveTo(5.8341f, 7.25f, 5.1103f, 6.8997f, 4.5764f, 6.3062f)
                    lineTo(3.4612f, 7.3094f)
                    close()
                    moveTo(9.71f, 0.8922f)
                    curveTo(8.9139f, -0.1008f, 7.7255f, -0.75f, 6.381f, -0.75f)
                    verticalLineTo(0.75f)
                    curveTo(7.2235f, 0.75f, 7.9976f, 1.1543f, 8.5397f, 1.8305f)
                    lineTo(9.71f, 0.8922f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero
                ) {
                    moveTo(15.0f, 19.0f)
                    horizontalLineTo(9.0f)
                }
            }
        }
            .build()
        return _smartphoneUpdate!!
    }

private var _smartphoneUpdate: ImageVector? = null
