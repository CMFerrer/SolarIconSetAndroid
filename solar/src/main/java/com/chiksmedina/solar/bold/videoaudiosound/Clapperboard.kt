package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.Clapperboard: ImageVector
    get() {
        if (_clapperboard != null) {
            return _clapperboard!!
        }
        _clapperboard = Builder(
            name = "Clapperboard", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0957f, 2.0045f)
                curveTo(6.6219f, 2.0307f, 4.7168f, 2.2121f, 3.4645f, 3.4645f)
                curveTo(2.6068f, 4.3221f, 2.2514f, 5.4859f, 2.1042f, 7.25f)
                horizontalLineTo(6.5986f)
                lineTo(10.0957f, 2.0045f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0264f, 8.75f)
                curveTo(2.0f, 9.6888f, 2.0f, 10.7633f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 10.7633f, 22.0f, 9.6888f, 21.9736f, 8.75f)
                horizontalLineTo(2.0264f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.8958f, 7.25f)
                curveTo(21.7486f, 5.4859f, 21.3932f, 4.3221f, 20.5355f, 3.4645f)
                curveTo(19.9382f, 2.8671f, 19.1924f, 2.5134f, 18.1987f, 2.304f)
                lineTo(14.9014f, 7.25f)
                horizontalLineTo(21.8958f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.5401f, 2.0878f)
                curveTo(15.3293f, 2.0f, 13.8452f, 2.0f, 12.0f, 2.0f)
                curveTo(11.967f, 2.0f, 11.9342f, 2.0f, 11.9014f, 2.0f)
                lineTo(8.4014f, 7.25f)
                horizontalLineTo(13.0986f)
                lineTo(16.5401f, 2.0878f)
                close()
            }
        }
            .build()
        return _clapperboard!!
    }

private var _clapperboard: ImageVector? = null
