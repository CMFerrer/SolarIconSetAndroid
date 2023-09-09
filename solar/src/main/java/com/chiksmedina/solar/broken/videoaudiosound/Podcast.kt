package com.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.VideoAudioSoundGroup

public val VideoAudioSoundGroup.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(name = "Podcast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                curveTo(9.0f, 8.3432f, 10.3431f, 7.0f, 12.0f, 7.0f)
                curveTo(13.6569f, 7.0f, 15.0f, 8.3432f, 15.0f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 14.6569f, 13.6569f, 16.0f, 12.0f, 16.0f)
                curveTo(10.3431f, 16.0f, 9.0f, 14.6569f, 9.0f, 13.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 10.0f)
                lineTo(15.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                lineTo(15.0f, 13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                lineTo(10.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                lineTo(10.0f, 13.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9514f, 8.2499f)
                curveTo(17.0894f, 8.6405f, 17.5179f, 8.8452f, 17.9085f, 8.7071f)
                curveTo(18.299f, 8.5691f, 18.5037f, 8.1406f, 18.3656f, 7.7501f)
                lineTo(16.9514f, 8.2499f)
                close()
                moveTo(6.75f, 14.1538f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.25f)
                verticalLineTo(14.1538f)
                horizontalLineTo(6.75f)
                close()
                moveTo(5.25f, 14.1538f)
                curveTo(5.25f, 14.7592f, 4.7592f, 15.25f, 4.1538f, 15.25f)
                verticalLineTo(16.75f)
                curveTo(5.5876f, 16.75f, 6.75f, 15.5877f, 6.75f, 14.1538f)
                horizontalLineTo(5.25f)
                close()
                moveTo(17.2499f, 14.1538f)
                curveTo(17.2499f, 15.5877f, 18.4123f, 16.75f, 19.8461f, 16.75f)
                verticalLineTo(15.25f)
                curveTo(19.2407f, 15.25f, 18.7499f, 14.7592f, 18.7499f, 14.1538f)
                horizontalLineTo(17.2499f)
                close()
                moveTo(11.9999f, 3.25f)
                curveTo(8.272f, 3.25f, 5.25f, 6.2721f, 5.25f, 10.0f)
                horizontalLineTo(6.75f)
                curveTo(6.75f, 7.1005f, 9.1005f, 4.75f, 11.9999f, 4.75f)
                verticalLineTo(3.25f)
                close()
                moveTo(11.9999f, 4.75f)
                curveTo(14.2847f, 4.75f, 16.2303f, 6.2098f, 16.9514f, 8.2499f)
                lineTo(18.3656f, 7.7501f)
                curveTo(17.4394f, 5.1294f, 14.9401f, 3.25f, 11.9999f, 3.25f)
                verticalLineTo(4.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 10.8954f, 2.8954f, 10.0f, 4.0f, 10.0f)
                curveTo(5.1046f, 10.0f, 6.0f, 10.8954f, 6.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(6.0f, 15.1046f, 5.1046f, 16.0f, 4.0f, 16.0f)
                curveTo(2.8954f, 16.0f, 2.0f, 15.1046f, 2.0f, 14.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 10.8954f, 18.8954f, 10.0f, 20.0f, 10.0f)
                curveTo(21.1046f, 10.0f, 22.0f, 10.8954f, 22.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 15.1046f, 21.1046f, 16.0f, 20.0f, 16.0f)
                curveTo(18.8954f, 16.0f, 18.0f, 15.1046f, 18.0f, 14.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                verticalLineTo(19.0f)
            }
        }
        .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
