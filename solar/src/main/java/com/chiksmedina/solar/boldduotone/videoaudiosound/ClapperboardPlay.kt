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

public val VideoAudioSoundGroup.ClapperboardPlay: ImageVector
    get() {
        if (_clapperboardPlay != null) {
            return _clapperboardPlay!!
        }
        _clapperboardPlay = Builder(name = "ClapperboardPlay", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 10.7632f, 2.0f, 9.6887f, 2.0264f, 8.75f)
                horizontalLineTo(21.9736f)
                curveTo(22.0f, 9.6887f, 22.0f, 10.7632f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.071f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.071f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.5f)
                curveTo(15.0f, 13.8666f, 14.338f, 13.4395f, 13.014f, 12.5852f)
                curveTo(11.6719f, 11.7193f, 11.0008f, 11.2863f, 10.5004f, 11.6042f)
                curveTo(10.0f, 11.9221f, 10.0f, 12.7814f, 10.0f, 14.5f)
                curveTo(10.0f, 16.2186f, 10.0f, 17.0779f, 10.5004f, 17.3958f)
                curveTo(11.0008f, 17.7137f, 11.6719f, 17.2807f, 13.014f, 16.4148f)
                curveTo(14.338f, 15.5605f, 15.0f, 15.1334f, 15.0f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 2.0f)
                curveTo(13.845f, 2.0f, 15.3291f, 2.0f, 16.5399f, 2.0878f)
                lineTo(13.0984f, 7.25f)
                horizontalLineTo(8.4012f)
                lineTo(11.9012f, 2.0f)
                horizontalLineTo(11.9998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.4643f, 3.4645f)
                curveTo(4.7167f, 2.2121f, 6.6218f, 2.0307f, 10.0955f, 2.0045f)
                lineTo(6.5984f, 7.25f)
                horizontalLineTo(2.104f)
                curveTo(2.2513f, 5.4859f, 2.6066f, 4.3221f, 3.4643f, 3.4645f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8956f, 7.25f)
                curveTo(21.7484f, 5.4859f, 21.393f, 4.3221f, 20.5354f, 3.4645f)
                curveTo(19.938f, 2.8671f, 19.1922f, 2.5134f, 18.1985f, 2.304f)
                lineTo(14.9012f, 7.25f)
                horizontalLineTo(21.8956f)
                close()
            }
        }
        .build()
        return _clapperboardPlay!!
    }

private var _clapperboardPlay: ImageVector? = null
