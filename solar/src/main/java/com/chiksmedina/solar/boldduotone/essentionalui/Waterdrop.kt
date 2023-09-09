package com.chiksmedina.solar.boldduotone.essentionalui

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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.Waterdrop: ImageVector
    get() {
        if (_waterdrop != null) {
            return _waterdrop!!
        }
        _waterdrop = Builder(name = "Waterdrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.6115f, 22.0f)
                horizontalLineTo(12.3885f)
                curveTo(17.1445f, 22.0f, 21.0f, 18.0569f, 21.0f, 13.1928f)
                verticalLineTo(12.9281f)
                curveTo(21.0f, 8.3165f, 18.2715f, 4.1635f, 14.0967f, 2.4208f)
                curveTo(12.7527f, 1.8597f, 11.2473f, 1.8597f, 9.9033f, 2.4208f)
                curveTo(5.7285f, 4.1635f, 3.0f, 8.3165f, 3.0f, 12.9281f)
                verticalLineTo(13.1928f)
                curveTo(3.0f, 18.0569f, 6.8555f, 22.0f, 11.6115f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0663f, 5.9613f)
                curveTo(12.2401f, 6.3372f, 12.0763f, 6.7829f, 11.7003f, 6.9568f)
                curveTo(10.1548f, 7.6715f, 8.907f, 9.1251f, 8.3295f, 10.9497f)
                curveTo(8.2045f, 11.3447f, 7.7831f, 11.5635f, 7.3881f, 11.4385f)
                curveTo(6.9932f, 11.3135f, 6.7744f, 10.892f, 6.8994f, 10.4971f)
                curveTo(7.5914f, 8.3108f, 9.1058f, 6.504f, 11.0707f, 5.5953f)
                curveTo(11.4467f, 5.4215f, 11.8924f, 5.5853f, 12.0663f, 5.9613f)
                close()
            }
        }
        .build()
        return _waterdrop!!
    }

private var _waterdrop: ImageVector? = null
