package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

public val VideoAudioSoundGroup.SoundwaveCircle: ImageVector
    get() {
        if (_soundwaveCircle != null) {
            return _soundwaveCircle!!
        }
        _soundwaveCircle = Builder(name = "SoundwaveCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.75f, 7.0f)
                curveTo(12.75f, 6.5858f, 12.4142f, 6.25f, 12.0f, 6.25f)
                curveTo(11.5858f, 6.25f, 11.25f, 6.5858f, 11.25f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(11.25f, 17.4142f, 11.5858f, 17.75f, 12.0f, 17.75f)
                curveTo(12.4142f, 17.75f, 12.75f, 17.4142f, 12.75f, 17.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(7.75f, 9.0f)
                curveTo(7.75f, 8.5858f, 7.4142f, 8.25f, 7.0f, 8.25f)
                curveTo(6.5858f, 8.25f, 6.25f, 8.5858f, 6.25f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(6.25f, 15.4142f, 6.5858f, 15.75f, 7.0f, 15.75f)
                curveTo(7.4142f, 15.75f, 7.75f, 15.4142f, 7.75f, 15.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(17.75f, 10.0f)
                curveTo(17.75f, 9.5858f, 17.4142f, 9.25f, 17.0f, 9.25f)
                curveTo(16.5858f, 9.25f, 16.25f, 9.5858f, 16.25f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(16.25f, 14.4142f, 16.5858f, 14.75f, 17.0f, 14.75f)
                curveTo(17.4142f, 14.75f, 17.75f, 14.4142f, 17.75f, 14.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.25f)
                curveTo(12.4142f, 6.25f, 12.75f, 6.5858f, 12.75f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(12.75f, 17.4142f, 12.4142f, 17.75f, 12.0f, 17.75f)
                curveTo(11.5858f, 17.75f, 11.25f, 17.4142f, 11.25f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(11.25f, 6.5858f, 11.5858f, 6.25f, 12.0f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 8.25f)
                curveTo(7.4142f, 8.25f, 7.75f, 8.5858f, 7.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(7.75f, 15.4142f, 7.4142f, 15.75f, 7.0f, 15.75f)
                curveTo(6.5858f, 15.75f, 6.25f, 15.4142f, 6.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(6.25f, 8.5858f, 6.5858f, 8.25f, 7.0f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 9.25f)
                curveTo(17.4142f, 9.25f, 17.75f, 9.5858f, 17.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(17.75f, 14.4142f, 17.4142f, 14.75f, 17.0f, 14.75f)
                curveTo(16.5858f, 14.75f, 16.25f, 14.4142f, 16.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(16.25f, 9.5858f, 16.5858f, 9.25f, 17.0f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.25f)
                curveTo(12.4142f, 6.25f, 12.75f, 6.5858f, 12.75f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(12.75f, 17.4142f, 12.4142f, 17.75f, 12.0f, 17.75f)
                curveTo(11.5858f, 17.75f, 11.25f, 17.4142f, 11.25f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(11.25f, 6.5858f, 11.5858f, 6.25f, 12.0f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 8.25f)
                curveTo(7.4142f, 8.25f, 7.75f, 8.5858f, 7.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(7.75f, 15.4142f, 7.4142f, 15.75f, 7.0f, 15.75f)
                curveTo(6.5858f, 15.75f, 6.25f, 15.4142f, 6.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(6.25f, 8.5858f, 6.5858f, 8.25f, 7.0f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.25f)
                curveTo(17.4142f, 9.25f, 17.75f, 9.5858f, 17.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(17.75f, 14.4142f, 17.4142f, 14.75f, 17.0f, 14.75f)
                curveTo(16.5858f, 14.75f, 16.25f, 14.4142f, 16.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(16.25f, 9.5858f, 16.5858f, 9.25f, 17.0f, 9.25f)
                close()
            }
        }
        .build()
        return _soundwaveCircle!!
    }

private var _soundwaveCircle: ImageVector? = null
