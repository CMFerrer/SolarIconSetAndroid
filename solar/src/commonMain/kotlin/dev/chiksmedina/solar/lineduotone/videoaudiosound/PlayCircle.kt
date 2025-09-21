package dev.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = Builder(
            name = "PlayCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.8876f, 9.9348f)
                curveTo(14.9625f, 10.8117f, 15.5f, 11.2501f, 15.5f, 12.0f)
                curveTo(15.5f, 12.7499f, 14.9625f, 13.1883f, 13.8876f, 14.0652f)
                curveTo(13.5909f, 14.3073f, 13.2966f, 14.5352f, 13.0261f, 14.7251f)
                curveTo(12.7888f, 14.8917f, 12.5201f, 15.064f, 12.2419f, 15.2332f)
                curveTo(11.1695f, 15.8853f, 10.6333f, 16.2114f, 10.1524f, 15.8504f)
                curveTo(9.6715f, 15.4894f, 9.6278f, 14.7336f, 9.5404f, 13.2222f)
                curveTo(9.5157f, 12.7947f, 9.5f, 12.3757f, 9.5f, 12.0f)
                curveTo(9.5f, 11.6243f, 9.5157f, 11.2053f, 9.5404f, 10.7778f)
                curveTo(9.6278f, 9.2664f, 9.6715f, 8.5106f, 10.1524f, 8.1496f)
                curveTo(10.6333f, 7.7886f, 11.1695f, 8.1147f, 12.2419f, 8.7668f)
                curveTo(12.5201f, 8.936f, 12.7888f, 9.1083f, 13.0261f, 9.2749f)
                curveTo(13.2966f, 9.4648f, 13.5909f, 9.6927f, 13.8876f, 9.9348f)
                close()
            }
        }
            .build()
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
