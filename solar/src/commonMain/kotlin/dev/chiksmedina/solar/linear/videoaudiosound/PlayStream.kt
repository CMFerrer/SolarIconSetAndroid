package dev.chiksmedina.solar.linear.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.VideoAudioSoundGroup

val VideoAudioSoundGroup.PlayStream: ImageVector
    get() {
        if (_playStream != null) {
            return _playStream!!
        }
        _playStream = Builder(
            name = "PlayStream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.1414f, 5.0f)
                curveTo(20.9097f, 6.8038f, 22.0f, 9.2746f, 22.0f, 12.0f)
                curveTo(22.0f, 14.7578f, 20.8836f, 17.2549f, 19.0782f, 19.064f)
                moveTo(5.0f, 19.1415f)
                curveTo(3.1486f, 17.3265f, 2.0f, 14.7974f, 2.0f, 12.0f)
                curveTo(2.0f, 9.235f, 3.1222f, 6.7321f, 4.936f, 4.9219f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.2849f, 8.044f)
                curveTo(17.3458f, 9.0588f, 18.0f, 10.4488f, 18.0f, 11.9822f)
                curveTo(18.0f, 13.5338f, 17.3302f, 14.9386f, 16.2469f, 15.9564f)
                moveTo(7.8f, 16.0f)
                curveTo(6.6892f, 14.9789f, 6.0f, 13.556f, 6.0f, 11.9822f)
                curveTo(6.0f, 10.4266f, 6.6733f, 9.0184f, 7.7616f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.6563f, 10.4511f)
                curveTo(14.5521f, 11.1088f, 15.0f, 11.4376f, 15.0f, 12.0f)
                curveTo(15.0f, 12.5624f, 14.5521f, 12.8912f, 13.6563f, 13.5489f)
                curveTo(13.4091f, 13.7304f, 13.1638f, 13.9014f, 12.9384f, 14.0438f)
                curveTo(12.7407f, 14.1688f, 12.5168f, 14.298f, 12.2849f, 14.4249f)
                curveTo(11.3913f, 14.914f, 10.9444f, 15.1586f, 10.5437f, 14.8878f)
                curveTo(10.1429f, 14.617f, 10.1065f, 14.0502f, 10.0337f, 12.9166f)
                curveTo(10.0131f, 12.596f, 10.0f, 12.2817f, 10.0f, 12.0f)
                curveTo(10.0f, 11.7183f, 10.0131f, 11.404f, 10.0337f, 11.0834f)
                curveTo(10.1065f, 9.9498f, 10.1429f, 9.383f, 10.5437f, 9.1122f)
                curveTo(10.9444f, 8.8414f, 11.3913f, 9.086f, 12.2849f, 9.5751f)
                curveTo(12.5168f, 9.702f, 12.7407f, 9.8312f, 12.9384f, 9.9562f)
                curveTo(13.1638f, 10.0986f, 13.4091f, 10.2696f, 13.6563f, 10.4511f)
                close()
            }
        }
            .build()
        return _playStream!!
    }

private var _playStream: ImageVector? = null
