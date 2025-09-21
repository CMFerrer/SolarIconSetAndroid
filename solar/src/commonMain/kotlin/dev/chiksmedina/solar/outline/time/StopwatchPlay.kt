package dev.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.TimeGroup

val TimeGroup.StopwatchPlay: ImageVector
    get() {
        if (_stopwatchPlay != null) {
            return _stopwatchPlay!!
        }
        _stopwatchPlay = Builder(
            name = "StopwatchPlay", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 2.0f)
                curveTo(9.25f, 1.5858f, 9.5858f, 1.25f, 10.0f, 1.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 1.25f, 14.75f, 1.5858f, 14.75f, 2.0f)
                curveTo(14.75f, 2.4142f, 14.4142f, 2.75f, 14.0f, 2.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 2.75f, 9.25f, 2.4142f, 9.25f, 2.0f)
                close()
                moveTo(12.0f, 4.75f)
                curveTo(7.4436f, 4.75f, 3.75f, 8.4437f, 3.75f, 13.0f)
                curveTo(3.75f, 17.5563f, 7.4436f, 21.25f, 12.0f, 21.25f)
                curveTo(16.5563f, 21.25f, 20.25f, 17.5563f, 20.25f, 13.0f)
                curveTo(20.25f, 8.4437f, 16.5563f, 4.75f, 12.0f, 4.75f)
                close()
                moveTo(2.25f, 13.0f)
                curveTo(2.25f, 7.6152f, 6.6152f, 3.25f, 12.0f, 3.25f)
                curveTo(17.3848f, 3.25f, 21.75f, 7.6152f, 21.75f, 13.0f)
                curveTo(21.75f, 18.3848f, 17.3848f, 22.75f, 12.0f, 22.75f)
                curveTo(6.6152f, 22.75f, 2.25f, 18.3848f, 2.25f, 13.0f)
                close()
                moveTo(12.5727f, 9.0902f)
                curveTo(12.5923f, 9.1021f, 12.6119f, 9.114f, 12.6316f, 9.126f)
                curveTo(12.9188f, 9.3006f, 13.2022f, 9.4822f, 13.4571f, 9.6611f)
                curveTo(13.7473f, 9.8649f, 14.0567f, 10.1049f, 14.3617f, 10.3536f)
                curveTo(14.3771f, 10.3662f, 14.3925f, 10.3787f, 14.4078f, 10.3912f)
                curveTo(14.9056f, 10.7973f, 15.3532f, 11.1623f, 15.6659f, 11.5264f)
                curveTo(16.0204f, 11.9393f, 16.25f, 12.4034f, 16.25f, 13.0f)
                curveTo(16.25f, 13.5966f, 16.0204f, 14.0607f, 15.6659f, 14.4736f)
                curveTo(15.3532f, 14.8377f, 14.9057f, 15.2027f, 14.4078f, 15.6088f)
                lineTo(14.3617f, 15.6464f)
                curveTo(14.0567f, 15.8951f, 13.7473f, 16.1351f, 13.4571f, 16.3389f)
                curveTo(13.2022f, 16.5178f, 12.9188f, 16.6994f, 12.6316f, 16.874f)
                curveTo(12.6119f, 16.886f, 12.5923f, 16.8979f, 12.5727f, 16.9098f)
                curveTo(12.0879f, 17.2049f, 11.6298f, 17.4836f, 11.2289f, 17.6276f)
                curveTo(11.0061f, 17.7076f, 10.7505f, 17.7664f, 10.4754f, 17.7459f)
                curveTo(10.1864f, 17.7244f, 9.9277f, 17.6195f, 9.7022f, 17.4502f)
                curveTo(9.2431f, 17.1056f, 9.0587f, 16.6066f, 8.9625f, 16.1104f)
                curveTo(8.8709f, 15.6376f, 8.8357f, 15.0287f, 8.7946f, 14.3171f)
                lineTo(8.7916f, 14.2655f)
                curveTo(8.7664f, 13.8293f, 8.75f, 13.3949f, 8.75f, 13.0f)
                curveTo(8.75f, 12.6051f, 8.7664f, 12.1707f, 8.7916f, 11.7345f)
                lineTo(8.7946f, 11.6829f)
                curveTo(8.8357f, 10.9713f, 8.8709f, 10.3624f, 8.9625f, 9.8896f)
                curveTo(9.0587f, 9.3934f, 9.2431f, 8.8944f, 9.7022f, 8.5498f)
                curveTo(9.9277f, 8.3805f, 10.1864f, 8.2756f, 10.4754f, 8.2541f)
                curveTo(10.7505f, 8.2336f, 11.0061f, 8.2924f, 11.2289f, 8.3724f)
                curveTo(11.6298f, 8.5164f, 12.0879f, 8.7951f, 12.5727f, 9.0902f)
                close()
                moveTo(10.6004f, 9.7511f)
                curveTo(10.5758f, 9.7699f, 10.5007f, 9.8365f, 10.4351f, 10.175f)
                curveTo(10.365f, 10.5368f, 10.3341f, 11.0435f, 10.2891f, 11.8212f)
                curveTo(10.2649f, 12.2399f, 10.25f, 12.6436f, 10.25f, 13.0f)
                curveTo(10.25f, 13.3564f, 10.2649f, 13.7601f, 10.2891f, 14.1788f)
                curveTo(10.3341f, 14.9565f, 10.365f, 15.4632f, 10.4351f, 15.825f)
                curveTo(10.5007f, 16.1635f, 10.5758f, 16.2301f, 10.6004f, 16.2489f)
                curveTo(10.6192f, 16.2465f, 10.6575f, 16.239f, 10.7218f, 16.2159f)
                curveTo(10.9612f, 16.1299f, 11.2865f, 15.9364f, 11.8523f, 15.5924f)
                curveTo(12.1215f, 15.4287f, 12.3755f, 15.2655f, 12.5951f, 15.1113f)
                curveTo(12.8458f, 14.9353f, 13.125f, 14.7194f, 13.4135f, 14.484f)
                curveTo(13.9722f, 14.0283f, 14.3127f, 13.747f, 14.5279f, 13.4964f)
                curveTo(14.7108f, 13.2833f, 14.75f, 13.1532f, 14.75f, 13.0f)
                curveTo(14.75f, 12.8468f, 14.7108f, 12.7167f, 14.5279f, 12.5036f)
                curveTo(14.3127f, 12.253f, 13.9722f, 11.9717f, 13.4135f, 11.516f)
                curveTo(13.125f, 11.2806f, 12.8458f, 11.0647f, 12.5951f, 10.8887f)
                curveTo(12.3755f, 10.7345f, 12.1215f, 10.5713f, 11.8523f, 10.4076f)
                curveTo(11.2865f, 10.0636f, 10.9612f, 9.8701f, 10.7218f, 9.7841f)
                curveTo(10.6575f, 9.761f, 10.6192f, 9.7535f, 10.6004f, 9.7511f)
                close()
            }
        }
            .build()
        return _stopwatchPlay!!
    }

private var _stopwatchPlay: ImageVector? = null
