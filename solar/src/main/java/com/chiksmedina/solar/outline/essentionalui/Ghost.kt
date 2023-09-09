package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.5f)
                curveTo(10.0f, 11.3284f, 9.5523f, 12.0f, 9.0f, 12.0f)
                curveTo(8.4477f, 12.0f, 8.0f, 11.3284f, 8.0f, 10.5f)
                curveTo(8.0f, 9.6716f, 8.4477f, 9.0f, 9.0f, 9.0f)
                curveTo(9.5523f, 9.0f, 10.0f, 9.6716f, 10.0f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.5f)
                curveTo(16.0f, 11.3284f, 15.5523f, 12.0f, 15.0f, 12.0f)
                curveTo(14.4477f, 12.0f, 14.0f, 11.3284f, 14.0f, 10.5f)
                curveTo(14.0f, 9.6716f, 14.4477f, 9.0f, 15.0f, 9.0f)
                curveTo(15.5523f, 9.0f, 16.0f, 9.6716f, 16.0f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0422f, 1.25f, 1.25f, 6.2186f, 1.25f, 12.3006f)
                verticalLineTo(19.723f)
                curveTo(1.25f, 21.5695f, 3.1625f, 22.8461f, 4.8426f, 21.9808f)
                curveTo(5.5243f, 21.6297f, 6.3349f, 21.6808f, 6.9716f, 22.1181f)
                curveTo(8.1986f, 22.9606f, 9.8014f, 22.9606f, 11.0284f, 22.1181f)
                lineTo(11.3811f, 21.8759f)
                curveTo(11.7572f, 21.6176f, 12.2428f, 21.6176f, 12.6189f, 21.8759f)
                lineTo(12.9716f, 22.1181f)
                curveTo(14.1986f, 22.9606f, 15.8014f, 22.9606f, 17.0284f, 22.1181f)
                curveTo(17.6651f, 21.6808f, 18.4757f, 21.6297f, 19.1574f, 21.9808f)
                curveTo(20.8375f, 22.8461f, 22.75f, 21.5695f, 22.75f, 19.723f)
                verticalLineTo(12.3006f)
                curveTo(22.75f, 6.2186f, 17.9578f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.75f, 12.3006f)
                curveTo(2.75f, 7.0048f, 6.9121f, 2.75f, 12.0f, 2.75f)
                curveTo(17.0879f, 2.75f, 21.25f, 7.0048f, 21.25f, 12.3006f)
                verticalLineTo(19.723f)
                curveTo(21.25f, 20.5212f, 20.4605f, 20.9647f, 19.8442f, 20.6472f)
                curveTo(18.6697f, 20.0424f, 17.2693f, 20.133f, 16.1793f, 20.8815f)
                curveTo(15.4639f, 21.3728f, 14.5361f, 21.3728f, 13.8207f, 20.8815f)
                lineTo(13.468f, 20.6394f)
                curveTo(12.5804f, 20.0298f, 11.4196f, 20.0298f, 10.532f, 20.6394f)
                lineTo(10.1793f, 20.8815f)
                curveTo(9.4639f, 21.3728f, 8.5361f, 21.3728f, 7.8207f, 20.8815f)
                curveTo(6.7307f, 20.133f, 5.3303f, 20.0424f, 4.1558f, 20.6472f)
                curveTo(3.5395f, 20.9647f, 2.75f, 20.5212f, 2.75f, 19.723f)
                verticalLineTo(12.3006f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
