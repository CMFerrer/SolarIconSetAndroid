package com.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsGroup

val ArrowsGroup.SquareTransferHorizontal: ImageVector
    get() {
        if (_squareTransferHorizontal != null) {
            return _squareTransferHorizontal!!
        }
        _squareTransferHorizontal = Builder(
            name = "SquareTransferHorizontal", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
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
                moveTo(11.0026f, 6.5068f)
                curveTo(11.2749f, 6.8189f, 11.2427f, 7.2927f, 10.9307f, 7.5651f)
                lineTo(9.0f, 9.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 9.25f, 17.75f, 9.5858f, 17.75f, 10.0f)
                curveTo(17.75f, 10.4142f, 17.4142f, 10.75f, 17.0f, 10.75f)
                horizontalLineTo(7.0f)
                curveTo(6.6874f, 10.75f, 6.4075f, 10.5561f, 6.2977f, 10.2633f)
                curveTo(6.188f, 9.9706f, 6.2713f, 9.6405f, 6.5068f, 9.4349f)
                lineTo(9.9444f, 6.4349f)
                curveTo(10.2564f, 6.1626f, 10.7302f, 6.1948f, 11.0026f, 6.5068f)
                close()
                moveTo(15.0f, 14.75f)
                lineTo(7.0f, 14.75f)
                curveTo(6.5858f, 14.75f, 6.25f, 14.4142f, 6.25f, 14.0f)
                curveTo(6.25f, 13.5858f, 6.5858f, 13.25f, 7.0f, 13.25f)
                lineTo(17.0f, 13.25f)
                curveTo(17.3126f, 13.25f, 17.5925f, 13.4439f, 17.7022f, 13.7367f)
                curveTo(17.812f, 14.0294f, 17.7287f, 14.3595f, 17.4932f, 14.5651f)
                lineTo(14.0557f, 17.5651f)
                curveTo(13.7436f, 17.8374f, 13.2698f, 17.8052f, 12.9974f, 17.4932f)
                curveTo(12.7251f, 17.1811f, 12.7573f, 16.7073f, 13.0693f, 16.4349f)
                lineTo(15.0f, 14.75f)
                close()
            }
        }
            .build()
        return _squareTransferHorizontal!!
    }

private var _squareTransferHorizontal: ImageVector? = null
