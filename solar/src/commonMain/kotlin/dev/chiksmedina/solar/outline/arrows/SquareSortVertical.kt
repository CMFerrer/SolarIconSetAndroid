package dev.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ArrowsGroup

val ArrowsGroup.SquareSortVertical: ImageVector
    get() {
        if (_squareSortVertical != null) {
            return _squareSortVertical!!
        }
        _squareSortVertical = Builder(
            name = "SquareSortVertical", defaultWidth = 24.0.dp,
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
                moveTo(14.5f, 7.25f)
                curveTo(14.7113f, 7.25f, 14.9128f, 7.3391f, 15.055f, 7.4955f)
                lineTo(17.555f, 10.2455f)
                curveTo(17.8336f, 10.552f, 17.811f, 11.0263f, 17.5045f, 11.305f)
                curveTo(17.198f, 11.5836f, 16.7237f, 11.561f, 16.445f, 11.2545f)
                lineTo(15.25f, 9.9399f)
                lineTo(15.25f, 16.0f)
                curveTo(15.25f, 16.4142f, 14.9142f, 16.75f, 14.5f, 16.75f)
                curveTo(14.0858f, 16.75f, 13.75f, 16.4142f, 13.75f, 16.0f)
                lineTo(13.75f, 9.9399f)
                lineTo(12.555f, 11.2545f)
                curveTo(12.2763f, 11.561f, 11.802f, 11.5836f, 11.4955f, 11.305f)
                curveTo(11.189f, 11.0263f, 11.1664f, 10.552f, 11.445f, 10.2455f)
                lineTo(13.945f, 7.4955f)
                curveTo(14.0872f, 7.3391f, 14.2887f, 7.25f, 14.5f, 7.25f)
                close()
                moveTo(9.5f, 7.25f)
                curveTo(9.9142f, 7.25f, 10.25f, 7.5858f, 10.25f, 8.0f)
                lineTo(10.25f, 14.06f)
                lineTo(11.445f, 12.7455f)
                curveTo(11.7237f, 12.439f, 12.198f, 12.4164f, 12.5045f, 12.695f)
                curveTo(12.811f, 12.9737f, 12.8336f, 13.448f, 12.555f, 13.7545f)
                lineTo(10.055f, 16.5045f)
                curveTo(9.9128f, 16.6609f, 9.7113f, 16.75f, 9.5f, 16.75f)
                curveTo(9.2887f, 16.75f, 9.0872f, 16.6609f, 8.9451f, 16.5045f)
                lineTo(6.445f, 13.7545f)
                curveTo(6.1664f, 13.448f, 6.189f, 12.9737f, 6.4955f, 12.695f)
                curveTo(6.802f, 12.4164f, 7.2763f, 12.439f, 7.555f, 12.7455f)
                lineTo(8.75f, 14.06f)
                lineTo(8.75f, 8.0f)
                curveTo(8.75f, 7.5858f, 9.0858f, 7.25f, 9.5f, 7.25f)
                close()
            }
        }
            .build()
        return _squareSortVertical!!
    }

private var _squareSortVertical: ImageVector? = null
