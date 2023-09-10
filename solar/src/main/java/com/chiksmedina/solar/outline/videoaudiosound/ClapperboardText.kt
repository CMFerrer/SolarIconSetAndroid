package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

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
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.8992f, 6.8155f, 2.8762f, 7.0273f, 2.8568f, 7.25f)
                horizontalLineTo(6.5883f)
                lineTo(9.4444f, 2.7619f)
                curveTo(8.3169f, 2.7792f, 7.392f, 2.8217f, 6.6136f, 2.9264f)
                close()
                moveTo(11.2072f, 2.7503f)
                curveTo(11.1886f, 2.8027f, 11.1638f, 2.8538f, 11.1327f, 2.9027f)
                lineTo(8.3663f, 7.25f)
                horizontalLineTo(13.0883f)
                lineTo(15.9189f, 2.8019f)
                curveTo(14.8557f, 2.7507f, 13.5747f, 2.75f, 12.0f, 2.75f)
                curveTo(11.727f, 2.75f, 11.4629f, 2.75f, 11.2072f, 2.7503f)
                close()
                moveTo(17.5982f, 2.957f)
                lineTo(14.8663f, 7.25f)
                horizontalLineTo(21.1432f)
                curveTo(21.1238f, 7.0273f, 21.1008f, 6.8155f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4677f, 3.4573f, 18.7512f, 3.1359f, 17.5982f, 2.957f)
                close()
                moveTo(21.2233f, 8.75f)
                horizontalLineTo(13.5112f)
                curveTo(13.5033f, 8.7501f, 13.4953f, 8.7501f, 13.4874f, 8.75f)
                horizontalLineTo(7.0112f)
                curveTo(7.0033f, 8.7501f, 6.9953f, 8.7501f, 6.9874f, 8.75f)
                horizontalLineTo(2.7767f)
                curveTo(2.7504f, 9.6717f, 2.75f, 10.7422f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 10.7422f, 21.2496f, 9.6717f, 21.2233f, 8.75f)
                close()
                moveTo(5.75f, 14.0f)
                curveTo(5.75f, 13.5858f, 6.0858f, 13.25f, 6.5f, 13.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 13.25f, 15.25f, 13.5858f, 15.25f, 14.0f)
                curveTo(15.25f, 14.4142f, 14.9142f, 14.75f, 14.5f, 14.75f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 14.75f, 5.75f, 14.4142f, 5.75f, 14.0f)
                close()
                moveTo(5.75f, 17.5f)
                curveTo(5.75f, 17.0858f, 6.0858f, 16.75f, 6.5f, 16.75f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 16.75f, 12.75f, 17.0858f, 12.75f, 17.5f)
                curveTo(12.75f, 17.9142f, 12.4142f, 18.25f, 12.0f, 18.25f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 18.25f, 5.75f, 17.9142f, 5.75f, 17.5f)
                close()
            }
        }
            .build()
        return _clapperboardText!!
    }

private var _clapperboardText: ImageVector? = null
