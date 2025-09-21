package dev.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SportsGroup

val SportsGroup.TreadmillRound: ImageVector
    get() {
        if (_treadmillRound != null) {
            return _treadmillRound!!
        }
        _treadmillRound = Builder(
            name = "TreadmillRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.0f, 2.75f)
                curveTo(14.3096f, 2.75f, 13.75f, 3.3096f, 13.75f, 4.0f)
                curveTo(13.75f, 4.6904f, 14.3096f, 5.25f, 15.0f, 5.25f)
                curveTo(15.6904f, 5.25f, 16.25f, 4.6904f, 16.25f, 4.0f)
                curveTo(16.25f, 3.3096f, 15.6904f, 2.75f, 15.0f, 2.75f)
                close()
                moveTo(12.25f, 4.0f)
                curveTo(12.25f, 2.4812f, 13.4812f, 1.25f, 15.0f, 1.25f)
                curveTo(16.5188f, 1.25f, 17.75f, 2.4812f, 17.75f, 4.0f)
                curveTo(17.75f, 5.5188f, 16.5188f, 6.75f, 15.0f, 6.75f)
                curveTo(13.4812f, 6.75f, 12.25f, 5.5188f, 12.25f, 4.0f)
                close()
                moveTo(7.2583f, 5.3916f)
                curveTo(7.9955f, 4.9309f, 8.9115f, 4.8604f, 9.7105f, 5.2028f)
                curveTo(11.4363f, 5.9424f, 11.8694f, 8.1913f, 10.5417f, 9.519f)
                lineTo(10.2124f, 9.8482f)
                curveTo(10.0802f, 9.9805f, 10.0428f, 10.0186f, 10.018f, 10.0472f)
                curveTo(9.5827f, 10.5498f, 9.617f, 11.3051f, 10.0959f, 11.7662f)
                curveTo(10.1232f, 11.7925f, 10.1639f, 11.827f, 10.3076f, 11.9467f)
                lineTo(10.3183f, 11.9556f)
                curveTo(10.3991f, 12.023f, 10.4549f, 12.0695f, 10.5077f, 12.117f)
                curveTo(11.2618f, 12.7952f, 11.709f, 13.75f, 11.7473f, 14.7636f)
                curveTo(11.75f, 14.8345f, 11.75f, 14.9071f, 11.75f, 15.0123f)
                verticalLineTo(16.0f)
                curveTo(11.75f, 16.4142f, 11.4142f, 16.75f, 11.0f, 16.75f)
                curveTo(10.5858f, 16.75f, 10.25f, 16.4142f, 10.25f, 16.0f)
                verticalLineTo(15.0263f)
                curveTo(10.25f, 14.902f, 10.2499f, 14.8593f, 10.2484f, 14.8202f)
                curveTo(10.2254f, 14.2121f, 9.9571f, 13.6392f, 9.5046f, 13.2322f)
                curveTo(9.4755f, 13.2061f, 9.4428f, 13.1786f, 9.3474f, 13.0991f)
                lineTo(9.3261f, 13.0814f)
                curveTo(9.2135f, 12.9876f, 9.1271f, 12.9156f, 9.0557f, 12.8468f)
                curveTo(8.0019f, 11.8325f, 7.9265f, 10.1708f, 8.8841f, 9.0652f)
                curveTo(8.9491f, 8.9902f, 9.0286f, 8.9107f, 9.1322f, 8.8071f)
                curveTo(9.1386f, 8.8007f, 9.1452f, 8.7942f, 9.1518f, 8.7876f)
                lineTo(9.481f, 8.4583f)
                curveTo(10.0583f, 7.881f, 9.87f, 6.9031f, 9.1196f, 6.5815f)
                curveTo(8.7722f, 6.4326f, 8.3738f, 6.4633f, 8.0533f, 6.6636f)
                lineTo(4.8975f, 8.636f)
                curveTo(4.5462f, 8.8555f, 4.0835f, 8.7487f, 3.864f, 8.3975f)
                curveTo(3.6445f, 8.0463f, 3.7513f, 7.5835f, 4.1025f, 7.364f)
                lineTo(7.2583f, 5.3916f)
                close()
                moveTo(22.7354f, 6.8529f)
                curveTo(22.8167f, 7.2591f, 22.5533f, 7.6542f, 22.1471f, 7.7354f)
                curveTo(20.9568f, 7.9735f, 20.0436f, 8.9322f, 19.8635f, 10.1326f)
                lineTo(18.9423f, 16.2737f)
                curveTo(20.9318f, 15.9353f, 22.75f, 17.4682f, 22.75f, 19.4888f)
                curveTo(22.75f, 21.2899f, 21.2899f, 22.75f, 19.4888f, 22.75f)
                horizontalLineTo(3.0868f)
                curveTo(2.0724f, 22.75f, 1.25f, 21.9276f, 1.25f, 20.9132f)
                curveTo(1.25f, 20.0209f, 1.8913f, 19.2576f, 2.7702f, 19.1038f)
                lineTo(17.3847f, 16.5463f)
                lineTo(18.3801f, 9.9101f)
                curveTo(18.6539f, 8.0845f, 20.0428f, 6.6266f, 21.8529f, 6.2646f)
                curveTo(22.2591f, 6.1833f, 22.6542f, 6.4467f, 22.7354f, 6.8529f)
                close()
                moveTo(11.7885f, 9.7628f)
                curveTo(11.9195f, 9.3699f, 12.3442f, 9.1575f, 12.7372f, 9.2885f)
                curveTo(13.5569f, 9.5617f, 14.4431f, 9.5617f, 15.2628f, 9.2885f)
                curveTo(15.6558f, 9.1575f, 16.0805f, 9.3699f, 16.2115f, 9.7628f)
                curveTo(16.3425f, 10.1558f, 16.1301f, 10.5805f, 15.7372f, 10.7115f)
                curveTo(14.6096f, 11.0874f, 13.3904f, 11.0874f, 12.2628f, 10.7115f)
                curveTo(11.8699f, 10.5805f, 11.6575f, 10.1558f, 11.7885f, 9.7628f)
                close()
                moveTo(7.5303f, 13.4697f)
                curveTo(7.8232f, 13.7626f, 7.8232f, 14.2374f, 7.5303f, 14.5303f)
                curveTo(6.4292f, 15.6314f, 4.9359f, 16.25f, 3.3787f, 16.25f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 16.25f, 2.25f, 15.9142f, 2.25f, 15.5f)
                curveTo(2.25f, 15.0858f, 2.5858f, 14.75f, 3.0f, 14.75f)
                horizontalLineTo(3.3787f)
                curveTo(4.538f, 14.75f, 5.6499f, 14.2895f, 6.4697f, 13.4697f)
                curveTo(6.7626f, 13.1768f, 7.2374f, 13.1768f, 7.5303f, 13.4697f)
                close()
                moveTo(21.25f, 19.4888f)
                curveTo(21.25f, 18.3947f, 20.2629f, 17.5654f, 19.1852f, 17.754f)
                lineTo(3.0288f, 20.5814f)
                curveTo(2.8676f, 20.6096f, 2.75f, 20.7495f, 2.75f, 20.9132f)
                curveTo(2.75f, 21.0992f, 2.9008f, 21.25f, 3.0868f, 21.25f)
                horizontalLineTo(19.4888f)
                curveTo(20.4615f, 21.25f, 21.25f, 20.4615f, 21.25f, 19.4888f)
                close()
            }
        }
            .build()
        return _treadmillRound!!
    }

private var _treadmillRound: ImageVector? = null
