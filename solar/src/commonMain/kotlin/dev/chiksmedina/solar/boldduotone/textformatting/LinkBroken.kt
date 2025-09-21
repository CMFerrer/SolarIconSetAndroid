package dev.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.LinkBroken: ImageVector
    get() {
        if (_linkBroken != null) {
            return _linkBroken!!
        }
        _linkBroken = Builder(
            name = "LinkBroken", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.9895f, 3.9909f)
                curveTo(18.4368f, 2.4697f, 16.3082f, 2.4117f, 15.2248f, 3.4731f)
                lineTo(11.5247f, 7.098f)
                curveTo(11.2289f, 7.3879f, 10.754f, 7.383f, 10.4641f, 7.0872f)
                curveTo(10.1743f, 6.7913f, 10.1791f, 6.3164f, 10.475f, 6.0265f)
                lineTo(14.1751f, 2.4016f)
                curveTo(16.011f, 0.6029f, 19.0888f, 1.0086f, 21.0392f, 2.9194f)
                curveTo(22.9924f, 4.833f, 23.4176f, 7.875f, 21.5678f, 9.6873f)
                lineTo(18.6606f, 12.5355f)
                curveTo(18.3647f, 12.8254f, 17.8899f, 12.8205f, 17.6f, 12.5246f)
                curveTo(17.3101f, 12.2288f, 17.315f, 11.7539f, 17.6109f, 11.464f)
                lineTo(20.518f, 8.6158f)
                curveTo(21.5875f, 7.5681f, 21.5394f, 5.5094f, 19.9895f, 3.9909f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.7274f, 12.5058f)
                curveTo(7.0069f, 12.2f, 6.9856f, 11.7256f, 6.6798f, 11.4462f)
                curveTo(6.3741f, 11.1667f, 5.8997f, 11.188f, 5.6202f, 11.4938f)
                lineTo(4.3594f, 12.8733f)
                curveTo(2.6325f, 14.7626f, 3.0097f, 17.9266f, 4.8637f, 19.955f)
                curveTo(6.7289f, 21.9956f, 9.7342f, 22.4592f, 11.5187f, 20.5068f)
                lineTo(15.5535f, 16.0924f)
                curveTo(15.8329f, 15.7866f, 15.8116f, 15.3122f, 15.5059f, 15.0328f)
                curveTo(15.2001f, 14.7533f, 14.7257f, 14.7746f, 14.4463f, 15.0804f)
                lineTo(10.4115f, 19.4948f)
                curveTo(9.4107f, 20.5898f, 7.4483f, 20.5593f, 5.9709f, 18.943f)
                curveTo(4.4824f, 17.3145f, 4.408f, 15.0434f, 5.4666f, 13.8852f)
                lineTo(6.7274f, 12.5058f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.6242f, 3.584f)
                curveTo(6.3945f, 3.2394f, 5.9288f, 3.1463f, 5.5842f, 3.376f)
                curveTo(5.2395f, 3.6058f, 5.1464f, 4.0715f, 5.3762f, 4.4161f)
                lineTo(7.3762f, 7.4161f)
                curveTo(7.6059f, 7.7607f, 8.0716f, 7.8539f, 8.4162f, 7.6241f)
                curveTo(8.7609f, 7.3944f, 8.854f, 6.9287f, 8.6242f, 6.5841f)
                lineTo(6.6242f, 3.584f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.2374f, 7.2886f)
                curveTo(1.8444f, 7.1576f, 1.4197f, 7.3699f, 1.2887f, 7.7629f)
                curveTo(1.1577f, 8.1559f, 1.3701f, 8.5806f, 1.763f, 8.7116f)
                lineTo(7.763f, 10.7116f)
                curveTo(8.156f, 10.8426f, 8.5807f, 10.6302f, 8.7117f, 10.2373f)
                curveTo(8.8427f, 9.8443f, 8.6303f, 9.4195f, 8.2374f, 9.2886f)
                lineTo(2.2374f, 7.2886f)
                close()
            }
        }
            .build()
        return _linkBroken!!
    }

private var _linkBroken: ImageVector? = null
