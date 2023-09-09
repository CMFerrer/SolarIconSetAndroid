package com.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MoneyGroup

public val MoneyGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                curveTo(14.0f, 10.4477f, 14.4477f, 10.0f, 15.0f, 10.0f)
                curveTo(15.5523f, 10.0f, 16.0f, 10.4477f, 16.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 13.5523f, 15.5523f, 14.0f, 15.0f, 14.0f)
                curveTo(14.4477f, 14.0f, 14.0f, 13.5523f, 14.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0079f, 19.0029f)
                lineTo(13.2579f, 19.0007f)
                lineTo(13.2579f, 19.0007f)
                lineTo(14.0079f, 19.0029f)
                close()
                moveTo(14.0137f, 17.0f)
                lineTo(14.7637f, 17.0022f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0137f)
                close()
                moveTo(3.1496f, 18.8284f)
                lineTo(2.6199f, 19.3594f)
                lineTo(2.6199f, 19.3594f)
                lineTo(3.1496f, 18.8284f)
                close()
                moveTo(3.1496f, 5.1716f)
                lineTo(2.6199f, 4.6406f)
                lineTo(2.6199f, 4.6406f)
                lineTo(3.1496f, 5.1716f)
                close()
                moveTo(2.9531f, 10.2537f)
                lineTo(2.5874f, 10.9085f)
                lineTo(2.5874f, 10.9085f)
                lineTo(2.9531f, 10.2537f)
                close()
                moveTo(2.0106f, 8.9895f)
                lineTo(1.2612f, 8.958f)
                lineTo(1.2612f, 8.958f)
                lineTo(2.0106f, 8.9895f)
                close()
                moveTo(2.9531f, 13.7463f)
                lineTo(2.5874f, 13.0915f)
                lineTo(2.5874f, 13.0915f)
                lineTo(2.9531f, 13.7463f)
                close()
                moveTo(2.0106f, 15.0105f)
                lineTo(2.7599f, 14.979f)
                lineTo(2.7599f, 14.979f)
                lineTo(2.0106f, 15.0105f)
                close()
                moveTo(21.0469f, 10.2537f)
                lineTo(21.4126f, 10.9085f)
                lineTo(21.4126f, 10.9085f)
                lineTo(21.0469f, 10.2537f)
                close()
                moveTo(21.9894f, 8.9895f)
                lineTo(22.7388f, 8.958f)
                lineTo(22.7388f, 8.958f)
                lineTo(21.9894f, 8.9895f)
                close()
                moveTo(20.8504f, 5.1716f)
                lineTo(21.3801f, 4.6406f)
                lineTo(21.3801f, 4.6406f)
                lineTo(20.8504f, 5.1716f)
                close()
                moveTo(21.0469f, 13.7463f)
                lineTo(20.6812f, 14.4012f)
                lineTo(20.6812f, 14.4012f)
                lineTo(21.0469f, 13.7463f)
                close()
                moveTo(21.9894f, 15.0105f)
                lineTo(22.7388f, 15.042f)
                lineTo(22.7388f, 15.042f)
                lineTo(21.9894f, 15.0105f)
                close()
                moveTo(20.8504f, 18.8284f)
                lineTo(21.3801f, 19.3594f)
                lineTo(21.3801f, 19.3594f)
                lineTo(20.8504f, 18.8284f)
                close()
                moveTo(21.9437f, 14.332f)
                lineTo(22.5981f, 13.9656f)
                lineTo(22.5981f, 13.9656f)
                lineTo(21.9437f, 14.332f)
                close()
                moveTo(21.9437f, 9.668f)
                lineTo(22.5981f, 10.0344f)
                lineTo(22.5981f, 10.0344f)
                lineTo(21.9437f, 9.668f)
                close()
                moveTo(2.0563f, 14.332f)
                lineTo(1.4019f, 13.9656f)
                lineTo(1.4019f, 13.9656f)
                lineTo(2.0563f, 14.332f)
                close()
                moveTo(2.0563f, 9.668f)
                lineTo(2.7108f, 9.3017f)
                lineTo(2.7108f, 9.3017f)
                lineTo(2.0563f, 9.668f)
                close()
                moveTo(14.0137f, 7.0f)
                lineTo(14.7637f, 7.0f)
                lineTo(14.7637f, 6.9978f)
                lineTo(14.0137f, 7.0f)
                close()
                moveTo(14.0064f, 4.4985f)
                lineTo(13.2564f, 4.5007f)
                lineTo(13.2564f, 4.5007f)
                lineTo(14.0064f, 4.4985f)
                close()
                moveTo(16.5278f, 4.0189f)
                lineTo(16.5471f, 3.2692f)
                lineTo(16.5471f, 3.2692f)
                lineTo(16.5278f, 4.0189f)
                close()
                moveTo(17.0336f, 19.9642f)
                lineTo(17.0653f, 20.7135f)
                lineTo(17.0653f, 20.7135f)
                lineTo(17.0336f, 19.9642f)
                close()
                moveTo(13.8595f, 19.8541f)
                lineTo(13.3299f, 19.323f)
                lineTo(13.3299f, 19.323f)
                lineTo(13.8595f, 19.8541f)
                close()
                moveTo(14.7579f, 19.0051f)
                lineTo(14.7637f, 17.0022f)
                lineTo(13.2637f, 16.9978f)
                lineTo(13.2579f, 19.0007f)
                lineTo(14.7579f, 19.0051f)
                close()
                moveTo(15.0162f, 16.75f)
                curveTo(15.1574f, 16.75f, 15.2687f, 16.8637f, 15.2687f, 17.0f)
                horizontalLineTo(16.7687f)
                curveTo(16.7687f, 16.0317f, 15.9823f, 15.25f, 15.0162f, 15.25f)
                verticalLineTo(16.75f)
                close()
                moveTo(15.0162f, 15.25f)
                curveTo(14.0501f, 15.25f, 13.2637f, 16.0317f, 13.2637f, 17.0f)
                horizontalLineTo(14.7637f)
                curveTo(14.7637f, 16.8637f, 14.875f, 16.75f, 15.0162f, 16.75f)
                verticalLineTo(15.25f)
                close()
                moveTo(9.995f, 4.75f)
                horizontalLineTo(13.5052f)
                verticalLineTo(3.25f)
                horizontalLineTo(9.995f)
                verticalLineTo(4.75f)
                close()
                moveTo(13.0079f, 19.25f)
                horizontalLineTo(9.995f)
                verticalLineTo(20.75f)
                horizontalLineTo(13.0079f)
                verticalLineTo(19.25f)
                close()
                moveTo(9.995f, 19.25f)
                curveTo(8.0836f, 19.25f, 6.7252f, 19.2484f, 5.6947f, 19.1102f)
                curveTo(4.6855f, 18.9749f, 4.1038f, 18.721f, 3.6793f, 18.2974f)
                lineTo(2.6199f, 19.3594f)
                curveTo(3.3698f, 20.1074f, 4.3205f, 20.4393f, 5.4953f, 20.5969f)
                curveTo(6.6487f, 20.7516f, 8.1258f, 20.75f, 9.995f, 20.75f)
                verticalLineTo(19.25f)
                close()
                moveTo(9.995f, 3.25f)
                curveTo(8.1258f, 3.25f, 6.6487f, 3.2484f, 5.4953f, 3.4031f)
                curveTo(4.3205f, 3.5607f, 3.3698f, 3.8925f, 2.6199f, 4.6406f)
                lineTo(3.6793f, 5.7026f)
                curveTo(4.1038f, 5.279f, 4.6855f, 5.0251f, 5.6947f, 4.8898f)
                curveTo(6.7252f, 4.7516f, 8.0836f, 4.75f, 9.995f, 4.75f)
                verticalLineTo(3.25f)
                close()
                moveTo(2.5874f, 10.9085f)
                curveTo(2.9731f, 11.1239f, 3.2301f, 11.533f, 3.2301f, 12.0f)
                horizontalLineTo(4.7301f)
                curveTo(4.7301f, 10.9664f, 4.1586f, 10.0678f, 3.3188f, 9.5988f)
                lineTo(2.5874f, 10.9085f)
                close()
                moveTo(2.7599f, 9.021f)
                curveTo(2.8379f, 7.1649f, 3.0915f, 6.2889f, 3.6793f, 5.7026f)
                lineTo(2.6199f, 4.6406f)
                curveTo(1.5904f, 5.6676f, 1.3401f, 7.0819f, 1.2612f, 8.958f)
                lineTo(2.7599f, 9.021f)
                close()
                moveTo(3.2301f, 12.0f)
                curveTo(3.2301f, 12.467f, 2.9731f, 12.8761f, 2.5874f, 13.0915f)
                lineTo(3.3188f, 14.4012f)
                curveTo(4.1586f, 13.9322f, 4.7301f, 13.0336f, 4.7301f, 12.0f)
                horizontalLineTo(3.2301f)
                close()
                moveTo(1.2612f, 15.042f)
                curveTo(1.3401f, 16.9182f, 1.5904f, 18.3324f, 2.6199f, 19.3594f)
                lineTo(3.6793f, 18.2974f)
                curveTo(3.0915f, 17.7111f, 2.8379f, 16.8351f, 2.7599f, 14.979f)
                lineTo(1.2612f, 15.042f)
                close()
                moveTo(20.7699f, 12.0f)
                curveTo(20.7699f, 11.533f, 21.0269f, 11.1239f, 21.4126f, 10.9085f)
                lineTo(20.6812f, 9.5988f)
                curveTo(19.8414f, 10.0678f, 19.2699f, 10.9664f, 19.2699f, 12.0f)
                horizontalLineTo(20.7699f)
                close()
                moveTo(22.7388f, 8.958f)
                curveTo(22.6599f, 7.0819f, 22.4096f, 5.6676f, 21.3801f, 4.6406f)
                lineTo(20.3207f, 5.7026f)
                curveTo(20.9085f, 6.2889f, 21.1621f, 7.1649f, 21.2401f, 9.021f)
                lineTo(22.7388f, 8.958f)
                close()
                moveTo(21.4126f, 13.0915f)
                curveTo(21.0269f, 12.8761f, 20.7699f, 12.467f, 20.7699f, 12.0f)
                horizontalLineTo(19.2699f)
                curveTo(19.2699f, 13.0336f, 19.8414f, 13.9322f, 20.6812f, 14.4012f)
                lineTo(21.4126f, 13.0915f)
                close()
                moveTo(21.2401f, 14.979f)
                curveTo(21.1621f, 16.8351f, 20.9085f, 17.7111f, 20.3207f, 18.2974f)
                lineTo(21.3801f, 19.3594f)
                curveTo(22.4096f, 18.3324f, 22.6599f, 16.9182f, 22.7388f, 15.042f)
                lineTo(21.2401f, 14.979f)
                close()
                moveTo(20.6812f, 14.4012f)
                curveTo(20.9652f, 14.5597f, 21.1507f, 14.6636f, 21.2761f, 14.7427f)
                curveTo(21.3379f, 14.7817f, 21.3653f, 14.8024f, 21.3735f, 14.8093f)
                curveTo(21.388f, 14.8213f, 21.3375f, 14.7846f, 21.2892f, 14.6983f)
                lineTo(22.5981f, 13.9656f)
                curveTo(22.5153f, 13.8177f, 22.4043f, 13.7154f, 22.3304f, 13.6542f)
                curveTo(22.2503f, 13.5878f, 22.1613f, 13.5276f, 22.0764f, 13.4741f)
                curveTo(21.9087f, 13.3683f, 21.6804f, 13.2411f, 21.4126f, 13.0915f)
                lineTo(20.6812f, 14.4012f)
                close()
                moveTo(22.7388f, 15.042f)
                curveTo(22.746f, 14.8706f, 22.7541f, 14.6937f, 22.7476f, 14.5458f)
                curveTo(22.741f, 14.3959f, 22.7178f, 14.1795f, 22.5981f, 13.9656f)
                lineTo(21.2892f, 14.6983f)
                curveTo(21.2386f, 14.6079f, 21.2461f, 14.5457f, 21.249f, 14.6117f)
                curveTo(21.2503f, 14.6404f, 21.2505f, 14.6822f, 21.2488f, 14.7464f)
                curveTo(21.2472f, 14.8104f, 21.244f, 14.8847f, 21.2401f, 14.979f)
                lineTo(22.7388f, 15.042f)
                close()
                moveTo(21.4126f, 10.9085f)
                curveTo(21.6804f, 10.7589f, 21.9087f, 10.6317f, 22.0764f, 10.5259f)
                curveTo(22.1613f, 10.4724f, 22.2503f, 10.4122f, 22.3304f, 10.3458f)
                curveTo(22.4043f, 10.2846f, 22.5153f, 10.1823f, 22.5981f, 10.0344f)
                lineTo(21.2892f, 9.3017f)
                curveTo(21.3375f, 9.2154f, 21.388f, 9.1787f, 21.3735f, 9.1907f)
                curveTo(21.3653f, 9.1976f, 21.3379f, 9.2183f, 21.2761f, 9.2572f)
                curveTo(21.1507f, 9.3364f, 20.9652f, 9.4403f, 20.6812f, 9.5988f)
                lineTo(21.4126f, 10.9085f)
                close()
                moveTo(21.2401f, 9.021f)
                curveTo(21.244f, 9.1153f, 21.2472f, 9.1896f, 21.2488f, 9.2536f)
                curveTo(21.2505f, 9.3178f, 21.2503f, 9.3596f, 21.249f, 9.3883f)
                curveTo(21.2461f, 9.4543f, 21.2386f, 9.3921f, 21.2892f, 9.3017f)
                lineTo(22.5981f, 10.0344f)
                curveTo(22.7178f, 9.8205f, 22.741f, 9.6041f, 22.7476f, 9.4542f)
                curveTo(22.7541f, 9.3063f, 22.746f, 9.1294f, 22.7388f, 8.958f)
                lineTo(21.2401f, 9.021f)
                close()
                moveTo(2.5874f, 13.0915f)
                curveTo(2.3196f, 13.2411f, 2.0913f, 13.3683f, 1.9236f, 13.4741f)
                curveTo(1.8387f, 13.5276f, 1.7497f, 13.5878f, 1.6696f, 13.6542f)
                curveTo(1.5957f, 13.7154f, 1.4847f, 13.8177f, 1.4019f, 13.9656f)
                lineTo(2.7108f, 14.6983f)
                curveTo(2.6625f, 14.7846f, 2.612f, 14.8213f, 2.6265f, 14.8093f)
                curveTo(2.6347f, 14.8024f, 2.6621f, 14.7817f, 2.7239f, 14.7427f)
                curveTo(2.8493f, 14.6636f, 3.0348f, 14.5597f, 3.3188f, 14.4012f)
                lineTo(2.5874f, 13.0915f)
                close()
                moveTo(2.7599f, 14.979f)
                curveTo(2.7559f, 14.8847f, 2.7529f, 14.8104f, 2.7512f, 14.7464f)
                curveTo(2.7495f, 14.6822f, 2.7497f, 14.6404f, 2.751f, 14.6117f)
                curveTo(2.7539f, 14.5457f, 2.7614f, 14.6079f, 2.7108f, 14.6983f)
                lineTo(1.4019f, 13.9656f)
                curveTo(1.2822f, 14.1795f, 1.259f, 14.3959f, 1.2524f, 14.5458f)
                curveTo(1.2459f, 14.6937f, 1.254f, 14.8706f, 1.2612f, 15.042f)
                lineTo(2.7599f, 14.979f)
                close()
                moveTo(3.3188f, 9.5988f)
                curveTo(3.0348f, 9.4403f, 2.8493f, 9.3364f, 2.7239f, 9.2572f)
                curveTo(2.6621f, 9.2183f, 2.6347f, 9.1976f, 2.6265f, 9.1907f)
                curveTo(2.612f, 9.1787f, 2.6625f, 9.2154f, 2.7108f, 9.3017f)
                lineTo(1.4019f, 10.0344f)
                curveTo(1.4847f, 10.1823f, 1.5956f, 10.2846f, 1.6696f, 10.3458f)
                curveTo(1.7497f, 10.4122f, 1.8387f, 10.4724f, 1.9236f, 10.5259f)
                curveTo(2.0913f, 10.6317f, 2.3196f, 10.7589f, 2.5874f, 10.9085f)
                lineTo(3.3188f, 9.5988f)
                close()
                moveTo(1.2612f, 8.958f)
                curveTo(1.254f, 9.1294f, 1.2459f, 9.3063f, 1.2524f, 9.4542f)
                curveTo(1.259f, 9.6041f, 1.2822f, 9.8205f, 1.4019f, 10.0344f)
                lineTo(2.7108f, 9.3017f)
                curveTo(2.7614f, 9.3921f, 2.7539f, 9.4543f, 2.751f, 9.3883f)
                curveTo(2.7497f, 9.3596f, 2.7495f, 9.3178f, 2.7512f, 9.2536f)
                curveTo(2.7529f, 9.1896f, 2.7559f, 9.1153f, 2.7599f, 9.021f)
                lineTo(1.2612f, 8.958f)
                close()
                moveTo(14.7637f, 6.9978f)
                lineTo(14.7564f, 4.4964f)
                lineTo(13.2564f, 4.5007f)
                lineTo(13.2637f, 7.0022f)
                lineTo(14.7637f, 6.9978f)
                close()
                moveTo(15.0162f, 7.25f)
                curveTo(14.875f, 7.25f, 14.7637f, 7.1363f, 14.7637f, 7.0f)
                horizontalLineTo(13.2637f)
                curveTo(13.2637f, 7.9683f, 14.0501f, 8.75f, 15.0162f, 8.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(15.2687f, 7.0f)
                curveTo(15.2687f, 7.1363f, 15.1574f, 7.25f, 15.0162f, 7.25f)
                verticalLineTo(8.75f)
                curveTo(15.9823f, 8.75f, 16.7687f, 7.9683f, 16.7687f, 7.0f)
                horizontalLineTo(15.2687f)
                close()
                moveTo(15.2687f, 4.5162f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.7687f)
                verticalLineTo(4.5162f)
                horizontalLineTo(15.2687f)
                close()
                moveTo(16.5084f, 4.7687f)
                curveTo(18.6966f, 4.8251f, 19.6778f, 5.0612f, 20.3208f, 5.7026f)
                lineTo(21.3801f, 4.6406f)
                curveTo(20.2676f, 3.5308f, 18.6939f, 3.3245f, 16.5471f, 3.2692f)
                lineTo(16.5084f, 4.7687f)
                close()
                moveTo(16.7687f, 4.5162f)
                curveTo(16.7687f, 4.656f, 16.6534f, 4.7724f, 16.5084f, 4.7687f)
                lineTo(16.5471f, 3.2692f)
                curveTo(15.8429f, 3.251f, 15.2687f, 3.8184f, 15.2687f, 4.5162f)
                horizontalLineTo(16.7687f)
                close()
                moveTo(13.5052f, 4.75f)
                curveTo(13.3698f, 4.75f, 13.2568f, 4.6403f, 13.2564f, 4.5007f)
                lineTo(14.7564f, 4.4964f)
                curveTo(14.7544f, 3.8057f, 14.1931f, 3.25f, 13.5052f, 3.25f)
                verticalLineTo(4.75f)
                close()
                moveTo(17.0653f, 20.7135f)
                curveTo(18.9399f, 20.6343f, 20.353f, 20.384f, 21.3801f, 19.3594f)
                lineTo(20.3208f, 18.2974f)
                curveTo(19.7336f, 18.8831f, 18.8563f, 19.1365f, 17.002f, 19.2148f)
                lineTo(17.0653f, 20.7135f)
                close()
                moveTo(15.2687f, 17.0f)
                verticalLineTo(18.9765f)
                horizontalLineTo(16.7687f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.2687f)
                close()
                moveTo(13.2579f, 19.0007f)
                curveTo(13.2575f, 19.1211f, 13.2572f, 19.2136f, 13.255f, 19.2926f)
                curveTo(13.2528f, 19.3721f, 13.249f, 19.4192f, 13.245f, 19.4481f)
                curveTo(13.2411f, 19.4764f, 13.2396f, 19.4669f, 13.2513f, 19.4387f)
                curveTo(13.2654f, 19.4045f, 13.2911f, 19.3617f, 13.3299f, 19.323f)
                lineTo(14.389f, 20.3852f)
                curveTo(14.6246f, 20.1502f, 14.701f, 19.8709f, 14.7311f, 19.6521f)
                curveTo(14.7582f, 19.4548f, 14.7573f, 19.219f, 14.7579f, 19.0051f)
                lineTo(13.2579f, 19.0007f)
                close()
                moveTo(13.0079f, 20.75f)
                curveTo(13.2218f, 20.75f, 13.4576f, 20.7516f, 13.6549f, 20.7251f)
                curveTo(13.8739f, 20.6957f, 14.1534f, 20.6201f, 14.389f, 20.3852f)
                lineTo(13.3299f, 19.323f)
                curveTo(13.3687f, 19.2843f, 13.4116f, 19.2587f, 13.4458f, 19.2447f)
                curveTo(13.4741f, 19.2331f, 13.4836f, 19.2346f, 13.4553f, 19.2384f)
                curveTo(13.4264f, 19.2423f, 13.3792f, 19.246f, 13.2998f, 19.248f)
                curveTo(13.2208f, 19.25f, 13.1282f, 19.25f, 13.0079f, 19.25f)
                verticalLineTo(20.75f)
                close()
                moveTo(17.002f, 19.2148f)
                curveTo(16.8812f, 19.2199f, 16.7889f, 19.2238f, 16.7101f, 19.225f)
                curveTo(16.631f, 19.2262f, 16.5849f, 19.2244f, 16.5575f, 19.2217f)
                curveTo(16.5309f, 19.2191f, 16.5426f, 19.2175f, 16.5734f, 19.2292f)
                curveTo(16.6103f, 19.2433f, 16.6536f, 19.2685f, 16.6917f, 19.305f)
                lineTo(15.6536f, 20.3878f)
                curveTo(15.8978f, 20.6219f, 16.183f, 20.6921f, 16.4108f, 20.7145f)
                curveTo(16.6127f, 20.7344f, 16.8518f, 20.7225f, 17.0653f, 20.7135f)
                lineTo(17.002f, 19.2148f)
                close()
                moveTo(15.2687f, 18.9765f)
                curveTo(15.2687f, 19.1953f, 15.267f, 19.4374f, 15.295f, 19.6397f)
                curveTo(15.3263f, 19.8655f, 15.407f, 20.1514f, 15.6536f, 20.3878f)
                lineTo(16.6917f, 19.305f)
                curveTo(16.7313f, 19.343f, 16.7584f, 19.3863f, 16.7737f, 19.4221f)
                curveTo(16.7863f, 19.4516f, 16.7848f, 19.4622f, 16.7808f, 19.4337f)
                curveTo(16.7768f, 19.4046f, 16.7729f, 19.3566f, 16.7708f, 19.2753f)
                curveTo(16.7687f, 19.1945f, 16.7687f, 19.0997f, 16.7687f, 18.9765f)
                horizontalLineTo(15.2687f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
