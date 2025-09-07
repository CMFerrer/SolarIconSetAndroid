package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.ClapperboardText: ImageVector
    get() {
        if (_clapperboardText != null) {
            return _clapperboardText!!
        }
        _clapperboardText = Builder(
            name = "ClapperboardText", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.5401f, 2.0878f)
                curveTo(15.3293f, 2.0f, 13.8452f, 2.0f, 12.0f, 2.0f)
                horizontalLineTo(11.9014f)
                lineTo(8.4014f, 7.25f)
                horizontalLineTo(13.0986f)
                lineTo(16.5401f, 2.0878f)
                close()
            }
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
                pathFillType = EvenOdd
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
                moveTo(5.75f, 14.0f)
                curveTo(5.75f, 13.5858f, 6.0858f, 13.25f, 6.5f, 13.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 13.25f, 15.25f, 13.5858f, 15.25f, 14.0f)
                curveTo(15.25f, 14.4142f, 14.9142f, 14.75f, 14.5f, 14.75f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 14.75f, 5.75f, 14.4142f, 5.75f, 14.0f)
                close()
                moveTo(6.5f, 16.75f)
                curveTo(6.0858f, 16.75f, 5.75f, 17.0858f, 5.75f, 17.5f)
                curveTo(5.75f, 17.9142f, 6.0858f, 18.25f, 6.5f, 18.25f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 18.25f, 12.75f, 17.9142f, 12.75f, 17.5f)
                curveTo(12.75f, 17.0858f, 12.4142f, 16.75f, 12.0f, 16.75f)
                horizontalLineTo(6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.5355f, 3.4645f)
                curveTo(21.3932f, 4.3221f, 21.7486f, 5.4859f, 21.8958f, 7.25f)
                horizontalLineTo(14.9014f)
                lineTo(18.1987f, 2.304f)
                curveTo(19.1924f, 2.5134f, 19.9382f, 2.8671f, 20.5355f, 3.4645f)
                close()
            }
        }
            .build()
        return _clapperboardText!!
    }

private var _clapperboardText: ImageVector? = null
