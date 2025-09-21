package dev.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.StarFall2: ImageVector
    get() {
        if (_starFall2 != null) {
            return _starFall2!!
        }
        _starFall2 = Builder(
            name = "StarFall2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.5803f, 4.776f)
                curveTo(12.275f, 3.0052f, 12.6224f, 2.1197f, 13.3488f, 2.0106f)
                curveTo(14.0753f, 1.9014f, 14.6997f, 2.6408f, 15.9486f, 4.1197f)
                lineTo(16.2716f, 4.5023f)
                curveTo(16.6265f, 4.9225f, 16.804f, 5.1326f, 17.0452f, 5.2526f)
                curveTo(17.2865f, 5.3726f, 17.5643f, 5.3888f, 18.1198f, 5.4214f)
                lineTo(18.6256f, 5.451f)
                curveTo(20.5806f, 5.5654f, 21.5581f, 5.6226f, 21.8973f, 6.2617f)
                curveTo(22.2365f, 6.9008f, 21.7128f, 7.6985f, 20.6654f, 9.294f)
                lineTo(20.3944f, 9.7068f)
                curveTo(20.0967f, 10.1602f, 19.9479f, 10.3869f, 19.9077f, 10.6457f)
                curveTo(19.8675f, 10.9045f, 19.9405f, 11.1662f, 20.0864f, 11.6895f)
                lineTo(20.2193f, 12.166f)
                curveTo(20.7328f, 14.0076f, 20.9895f, 14.9284f, 20.4727f, 15.4325f)
                curveTo(19.9559f, 15.9367f, 19.0078f, 15.6903f, 17.1116f, 15.1975f)
                lineTo(16.621f, 15.07f)
                curveTo(16.0822f, 14.93f, 15.8128f, 14.86f, 15.5467f, 14.8999f)
                curveTo(15.2805f, 14.9399f, 15.0479f, 15.0854f, 14.5825f, 15.3763f)
                lineTo(14.1588f, 15.6412f)
                curveTo(12.5212f, 16.6649f, 11.7024f, 17.1768f, 11.0438f, 16.8493f)
                curveTo(10.3852f, 16.5217f, 10.3229f, 15.5717f, 10.1984f, 13.6717f)
                lineTo(10.1662f, 13.1801f)
                curveTo(10.1309f, 12.6402f, 10.1132f, 12.3702f, 9.9889f, 12.1361f)
                curveTo(9.8646f, 11.902f, 9.6479f, 11.7302f, 9.2143f, 11.3867f)
                lineTo(8.8196f, 11.0739f)
                curveTo(7.294f, 9.8651f, 6.5312f, 9.2606f, 6.641f, 8.5541f)
                curveTo(6.7508f, 7.8475f, 7.6604f, 7.5067f, 9.4796f, 6.8252f)
                lineTo(9.9503f, 6.6489f)
                curveTo(10.4673f, 6.4552f, 10.7258f, 6.3584f, 10.9151f, 6.1737f)
                curveTo(11.1044f, 5.989f, 11.2031f, 5.7374f, 11.4005f, 5.2342f)
                lineTo(11.5803f, 4.776f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.31f, 9.5923f)
                curveTo(2.8729f, 11.9208f, 1.275f, 15.8053f, 2.3312f, 21.9997f)
                curveTo(3.274f, 19.3961f, 5.8573f, 17.2402f, 8.9122f, 15.9523f)
                curveTo(8.8056f, 15.3596f, 8.7583f, 14.6359f, 8.7084f, 13.8728f)
                lineTo(8.6694f, 13.2777f)
                curveTo(8.6604f, 13.1393f, 8.6535f, 13.0342f, 8.6461f, 12.9439f)
                curveTo(8.643f, 12.9063f, 8.6401f, 12.8749f, 8.6374f, 12.8484f)
                curveTo(8.6142f, 12.8285f, 8.5859f, 12.8048f, 8.5512f, 12.7764f)
                curveTo(8.4787f, 12.7172f, 8.3938f, 12.6498f, 8.2828f, 12.5619f)
                lineTo(7.8076f, 12.1853f)
                curveTo(7.1145f, 11.6363f, 6.4688f, 11.1249f, 6.0249f, 10.6534f)
                curveTo(5.7718f, 10.3845f, 5.4888f, 10.0299f, 5.31f, 9.5923f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.3466f, 15.4226f)
                curveTo(10.3415f, 15.3852f, 10.3365f, 15.347f, 10.3316f, 15.3081f)
                lineTo(10.3877f, 15.4096f)
                curveTo(10.374f, 15.4139f, 10.3603f, 15.4182f, 10.3466f, 15.4226f)
                close()
            }
        }
            .build()
        return _starFall2!!
    }

private var _starFall2: ImageVector? = null
