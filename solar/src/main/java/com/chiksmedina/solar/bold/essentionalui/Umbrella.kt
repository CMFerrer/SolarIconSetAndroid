package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.4762f, 12.0f)
                curveTo(2.2132f, 12.0f, 2.0f, 11.7868f, 2.0f, 11.5238f)
                curveTo(2.0f, 7.0782f, 5.0459f, 3.3441f, 9.1647f, 2.2945f)
                curveTo(9.0126f, 2.4871f, 8.8714f, 2.6903f, 8.7407f, 2.8995f)
                curveTo(8.0048f, 4.0776f, 7.4934f, 5.6053f, 7.1342f, 7.0716f)
                curveTo(6.7723f, 8.549f, 6.5522f, 10.0191f, 6.4225f, 11.1149f)
                curveTo(6.3832f, 11.4464f, 6.3521f, 11.7448f, 6.3278f, 12.0f)
                horizontalLineTo(2.4762f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.5238f)
                curveTo(22.0f, 11.7868f, 21.7868f, 12.0f, 21.5238f, 12.0f)
                horizontalLineTo(17.6722f)
                curveTo(17.6479f, 11.7448f, 17.6168f, 11.4464f, 17.5775f, 11.1149f)
                curveTo(17.4478f, 10.0191f, 17.2277f, 8.549f, 16.8658f, 7.0716f)
                curveTo(16.5066f, 5.6053f, 15.9952f, 4.0776f, 15.2593f, 2.8995f)
                curveTo(15.1286f, 2.6903f, 14.9875f, 2.4871f, 14.8353f, 2.2945f)
                curveTo(18.9541f, 3.3441f, 22.0f, 7.0782f, 22.0f, 11.5238f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.8349f)
                curveTo(7.8559f, 11.7886f, 7.8814f, 11.5506f, 7.912f, 11.2913f)
                curveTo(8.0376f, 10.2309f, 8.2488f, 8.826f, 8.5911f, 7.4284f)
                curveTo(8.9362f, 6.0197f, 9.4019f, 4.6724f, 10.0129f, 3.6942f)
                curveTo(10.6292f, 2.7074f, 11.2887f, 2.25f, 12.0f, 2.25f)
                curveTo(12.7113f, 2.25f, 13.3708f, 2.7074f, 13.9871f, 3.6942f)
                curveTo(14.5981f, 4.6724f, 15.0638f, 6.0197f, 15.4089f, 7.4284f)
                curveTo(15.7512f, 8.826f, 15.9624f, 10.2309f, 16.0879f, 11.2913f)
                curveTo(16.1186f, 11.5506f, 16.1441f, 11.7886f, 16.1651f, 12.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.0f)
                curveTo(12.75f, 21.5188f, 11.5188f, 22.75f, 10.0f, 22.75f)
                curveTo(8.4812f, 22.75f, 7.25f, 21.5188f, 7.25f, 20.0f)
                verticalLineTo(19.0f)
                curveTo(7.25f, 18.5858f, 7.5858f, 18.25f, 8.0f, 18.25f)
                curveTo(8.4142f, 18.25f, 8.75f, 18.5858f, 8.75f, 19.0f)
                verticalLineTo(20.0f)
                curveTo(8.75f, 20.6904f, 9.3096f, 21.25f, 10.0f, 21.25f)
                curveTo(10.6904f, 21.25f, 11.25f, 20.6904f, 11.25f, 20.0f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
