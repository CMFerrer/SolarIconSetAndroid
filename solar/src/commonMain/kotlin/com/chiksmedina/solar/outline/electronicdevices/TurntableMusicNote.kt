package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.TurntableMusicNote: ImageVector
    get() {
        if (_turntableMusicNote != null) {
            return _turntableMusicNote!!
        }
        _turntableMusicNote = Builder(
            name = "TurntableMusicNote", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                curveTo(21.8222f, 3.6905f, 22.2305f, 4.624f, 22.4556f, 5.7734f)
                curveTo(22.6767f, 6.9019f, 22.7303f, 8.2897f, 22.7448f, 9.9936f)
                curveTo(22.7483f, 10.4078f, 22.4153f, 10.7465f, 22.0011f, 10.75f)
                curveTo(21.5869f, 10.7535f, 21.2483f, 10.4206f, 21.2448f, 10.0064f)
                curveTo(21.2303f, 8.2972f, 21.1747f, 7.0376f, 20.9836f, 6.0618f)
                curveTo(20.7966f, 5.1069f, 20.4897f, 4.4793f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(12.4142f, 21.25f, 12.75f, 21.5858f, 12.75f, 22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
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
                moveTo(8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 14.0711f, 14.0711f, 15.75f, 12.0f, 15.75f)
                curveTo(9.9289f, 15.75f, 8.25f, 14.0711f, 8.25f, 12.0f)
                close()
                moveTo(12.0f, 9.75f)
                curveTo(10.7574f, 9.75f, 9.75f, 10.7574f, 9.75f, 12.0f)
                curveTo(9.75f, 13.2426f, 10.7574f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                curveTo(14.25f, 10.7574f, 13.2426f, 9.75f, 12.0f, 9.75f)
                close()
                moveTo(19.0f, 11.25f)
                curveTo(19.4142f, 11.25f, 19.75f, 11.5858f, 19.75f, 12.0f)
                curveTo(19.75f, 13.2426f, 20.7574f, 14.25f, 22.0f, 14.25f)
                curveTo(22.4142f, 14.25f, 22.75f, 14.5858f, 22.75f, 15.0f)
                curveTo(22.75f, 15.4142f, 22.4142f, 15.75f, 22.0f, 15.75f)
                curveTo(21.1558f, 15.75f, 20.3767f, 15.471f, 19.75f, 15.0003f)
                verticalLineTo(20.0f)
                curveTo(19.75f, 21.5188f, 18.5188f, 22.75f, 17.0f, 22.75f)
                curveTo(15.4812f, 22.75f, 14.25f, 21.5188f, 14.25f, 20.0f)
                curveTo(14.25f, 18.4812f, 15.4812f, 17.25f, 17.0f, 17.25f)
                curveTo(17.4501f, 17.25f, 17.875f, 17.3581f, 18.25f, 17.5499f)
                verticalLineTo(12.0f)
                curveTo(18.25f, 11.5858f, 18.5858f, 11.25f, 19.0f, 11.25f)
                close()
                moveTo(18.25f, 20.0f)
                curveTo(18.25f, 19.3096f, 17.6904f, 18.75f, 17.0f, 18.75f)
                curveTo(16.3096f, 18.75f, 15.75f, 19.3096f, 15.75f, 20.0f)
                curveTo(15.75f, 20.6904f, 16.3096f, 21.25f, 17.0f, 21.25f)
                curveTo(17.6904f, 21.25f, 18.25f, 20.6904f, 18.25f, 20.0f)
                close()
            }
        }
            .build()
        return _turntableMusicNote!!
    }

private var _turntableMusicNote: ImageVector? = null
