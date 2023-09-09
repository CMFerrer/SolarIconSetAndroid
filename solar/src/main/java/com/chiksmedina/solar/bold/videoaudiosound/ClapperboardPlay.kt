package com.chiksmedina.solar.bold.videoaudiosound

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
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

public val VideoAudioSoundGroup.ClapperboardPlay: ImageVector
    get() {
        if (_clapperboardPlay != null) {
            return _clapperboardPlay!!
        }
        _clapperboardPlay = Builder(name = "ClapperboardPlay", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(13.8452f, 2.0f, 15.3293f, 2.0f, 16.5401f, 2.0878f)
                lineTo(13.0986f, 7.25f)
                horizontalLineTo(8.4014f)
                lineTo(11.9014f, 2.0f)
                horizontalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.4645f, 3.4645f)
                curveTo(4.7168f, 2.2121f, 6.6219f, 2.0307f, 10.0957f, 2.0045f)
                lineTo(6.5986f, 7.25f)
                horizontalLineTo(2.1042f)
                curveTo(2.2514f, 5.4859f, 2.6068f, 4.3221f, 3.4645f, 3.4645f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 10.7633f, 2.0f, 9.6888f, 2.0264f, 8.75f)
                horizontalLineTo(21.9736f)
                curveTo(22.0f, 9.6888f, 22.0f, 10.7633f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
                moveTo(13.014f, 12.5852f)
                curveTo(14.338f, 13.4395f, 15.0f, 13.8666f, 15.0f, 14.5f)
                curveTo(15.0f, 15.1334f, 14.338f, 15.5605f, 13.014f, 16.4148f)
                curveTo(11.6719f, 17.2807f, 11.0008f, 17.7137f, 10.5004f, 17.3958f)
                curveTo(10.0f, 17.0779f, 10.0f, 16.2186f, 10.0f, 14.5f)
                curveTo(10.0f, 12.7814f, 10.0f, 11.9221f, 10.5004f, 11.6042f)
                curveTo(11.0008f, 11.2863f, 11.6719f, 11.7193f, 13.014f, 12.5852f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8958f, 7.25f)
                curveTo(21.7486f, 5.4859f, 21.3932f, 4.3221f, 20.5355f, 3.4645f)
                curveTo(19.9382f, 2.8671f, 19.1924f, 2.5134f, 18.1987f, 2.304f)
                lineTo(14.9014f, 7.25f)
                horizontalLineTo(21.8958f)
                close()
            }
        }
        .build()
        return _clapperboardPlay!!
    }

private var _clapperboardPlay: ImageVector? = null
