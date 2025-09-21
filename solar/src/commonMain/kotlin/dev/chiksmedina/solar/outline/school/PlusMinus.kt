package dev.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) {
            return _plusMinus!!
        }
        _plusMinus = Builder(
            name = "PlusMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                curveTo(3.0449f, 18.268f, 3.2371f, 18.9082f, 3.5319f, 19.4075f)
                lineTo(19.4075f, 3.5319f)
                curveTo(18.9082f, 3.2371f, 18.268f, 3.0449f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
                moveTo(20.4681f, 4.5925f)
                lineTo(4.5925f, 20.4681f)
                curveTo(5.0918f, 20.7629f, 5.732f, 20.9551f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9551f, 5.732f, 20.7629f, 5.0918f, 20.4681f, 4.5925f)
                close()
                moveTo(8.0f, 4.75f)
                curveTo(8.4142f, 4.75f, 8.75f, 5.0858f, 8.75f, 5.5f)
                lineTo(8.75f, 7.25f)
                horizontalLineTo(10.5f)
                curveTo(10.9142f, 7.25f, 11.25f, 7.5858f, 11.25f, 8.0f)
                curveTo(11.25f, 8.4142f, 10.9142f, 8.75f, 10.5f, 8.75f)
                horizontalLineTo(8.75f)
                lineTo(8.75f, 10.5f)
                curveTo(8.75f, 10.9142f, 8.4142f, 11.25f, 8.0f, 11.25f)
                curveTo(7.5858f, 11.25f, 7.25f, 10.9142f, 7.25f, 10.5f)
                lineTo(7.25f, 8.75f)
                lineTo(5.5f, 8.75f)
                curveTo(5.0858f, 8.75f, 4.75f, 8.4142f, 4.75f, 8.0f)
                curveTo(4.75f, 7.5858f, 5.0858f, 7.25f, 5.5f, 7.25f)
                lineTo(7.25f, 7.25f)
                lineTo(7.25f, 5.5f)
                curveTo(7.25f, 5.0858f, 7.5858f, 4.75f, 8.0f, 4.75f)
                close()
                moveTo(12.25f, 17.0f)
                curveTo(12.25f, 16.5858f, 12.5858f, 16.25f, 13.0f, 16.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 16.25f, 18.75f, 16.5858f, 18.75f, 17.0f)
                curveTo(18.75f, 17.4142f, 18.4142f, 17.75f, 18.0f, 17.75f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 17.75f, 12.25f, 17.4142f, 12.25f, 17.0f)
                close()
            }
        }
            .build()
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
