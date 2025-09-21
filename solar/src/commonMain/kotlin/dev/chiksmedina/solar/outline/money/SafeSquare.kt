package dev.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.SafeSquare: ImageVector
    get() {
        if (_safeSquare != null) {
            return _safeSquare!!
        }
        _safeSquare = Builder(
            name = "SafeSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
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
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
                moveTo(6.0f, 6.25f)
                curveTo(6.4142f, 6.25f, 6.75f, 6.5858f, 6.75f, 7.0f)
                lineTo(6.75f, 17.0f)
                curveTo(6.75f, 17.4142f, 6.4142f, 17.75f, 6.0f, 17.75f)
                curveTo(5.5858f, 17.75f, 5.25f, 17.4142f, 5.25f, 17.0f)
                lineTo(5.25f, 7.0f)
                curveTo(5.25f, 6.5858f, 5.5858f, 6.25f, 6.0f, 6.25f)
                close()
                moveTo(9.4697f, 7.4697f)
                curveTo(9.7626f, 7.1768f, 10.2374f, 7.1768f, 10.5303f, 7.4697f)
                lineTo(11.932f, 8.8713f)
                curveTo(12.5248f, 8.4787f, 13.2357f, 8.25f, 14.0f, 8.25f)
                curveTo(14.7643f, 8.25f, 15.4752f, 8.4787f, 16.068f, 8.8713f)
                lineTo(17.4697f, 7.4697f)
                curveTo(17.7626f, 7.1768f, 18.2374f, 7.1768f, 18.5303f, 7.4697f)
                curveTo(18.8232f, 7.7626f, 18.8232f, 8.2374f, 18.5303f, 8.5303f)
                lineTo(17.1287f, 9.932f)
                curveTo(17.5213f, 10.5248f, 17.75f, 11.2357f, 17.75f, 12.0f)
                curveTo(17.75f, 12.7643f, 17.5213f, 13.4752f, 17.1287f, 14.068f)
                lineTo(18.5303f, 15.4697f)
                curveTo(18.8232f, 15.7626f, 18.8232f, 16.2374f, 18.5303f, 16.5303f)
                curveTo(18.2374f, 16.8232f, 17.7626f, 16.8232f, 17.4697f, 16.5303f)
                lineTo(16.068f, 15.1287f)
                curveTo(15.4752f, 15.5213f, 14.7643f, 15.75f, 14.0f, 15.75f)
                curveTo(13.2357f, 15.75f, 12.5248f, 15.5213f, 11.932f, 15.1287f)
                lineTo(10.5303f, 16.5303f)
                curveTo(10.2374f, 16.8232f, 9.7626f, 16.8232f, 9.4697f, 16.5303f)
                curveTo(9.1768f, 16.2374f, 9.1768f, 15.7626f, 9.4697f, 15.4697f)
                lineTo(10.8713f, 14.068f)
                curveTo(10.4787f, 13.4752f, 10.25f, 12.7643f, 10.25f, 12.0f)
                curveTo(10.25f, 11.2357f, 10.4787f, 10.5248f, 10.8713f, 9.932f)
                lineTo(9.4697f, 8.5303f)
                curveTo(9.1768f, 8.2374f, 9.1768f, 7.7626f, 9.4697f, 7.4697f)
                close()
                moveTo(14.0f, 9.75f)
                curveTo(12.7574f, 9.75f, 11.75f, 10.7574f, 11.75f, 12.0f)
                curveTo(11.75f, 13.2426f, 12.7574f, 14.25f, 14.0f, 14.25f)
                curveTo(15.2426f, 14.25f, 16.25f, 13.2426f, 16.25f, 12.0f)
                curveTo(16.25f, 10.7574f, 15.2426f, 9.75f, 14.0f, 9.75f)
                close()
            }
        }
            .build()
        return _safeSquare!!
    }

private var _safeSquare: ImageVector? = null
