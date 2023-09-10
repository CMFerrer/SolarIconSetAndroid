package com.chiksmedina.solar.linear.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.VideoAudioSoundGroup

val VideoAudioSoundGroup.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(
            name = "Podcast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 10.0f)
                curveTo(9.0f, 8.3432f, 10.3431f, 7.0f, 12.0f, 7.0f)
                curveTo(13.6569f, 7.0f, 15.0f, 8.3432f, 15.0f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 14.6569f, 13.6569f, 16.0f, 12.0f, 16.0f)
                curveTo(10.3431f, 16.0f, 9.0f, 14.6569f, 9.0f, 13.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 10.0f)
                lineTo(15.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 13.0f)
                lineTo(15.0f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 10.0f)
                lineTo(10.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 13.0f)
                lineTo(10.0f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.1539f, 16.0f)
                curveTo(5.1735f, 16.0f, 6.0f, 15.1734f, 6.0f, 14.1538f)
                verticalLineTo(10.0f)
                curveTo(6.0f, 6.6863f, 8.6863f, 4.0f, 12.0f, 4.0f)
                curveTo(15.3137f, 4.0f, 18.0f, 6.6863f, 18.0f, 10.0f)
                verticalLineTo(14.1538f)
                curveTo(18.0f, 15.1734f, 18.8265f, 16.0f, 19.8461f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 10.8954f, 2.8954f, 10.0f, 4.0f, 10.0f)
                curveTo(5.1046f, 10.0f, 6.0f, 10.8954f, 6.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(6.0f, 15.1046f, 5.1046f, 16.0f, 4.0f, 16.0f)
                curveTo(2.8954f, 16.0f, 2.0f, 15.1046f, 2.0f, 14.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 10.8954f, 18.8954f, 10.0f, 20.0f, 10.0f)
                curveTo(21.1046f, 10.0f, 22.0f, 10.8954f, 22.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 15.1046f, 21.1046f, 16.0f, 20.0f, 16.0f)
                curveTo(18.8954f, 16.0f, 18.0f, 15.1046f, 18.0f, 14.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 16.0f)
                verticalLineTo(19.0f)
            }
        }
            .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
