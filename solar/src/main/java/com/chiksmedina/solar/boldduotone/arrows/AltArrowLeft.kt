package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.AltArrowLeft: ImageVector
    get() {
        if (_altArrowLeft != null) {
            return _altArrowLeft!!
        }
        _altArrowLeft = Builder(
            name = "AltArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.5956f, 8.3027f)
                lineTo(8.1649f, 11.6296f)
                curveTo(7.945f, 11.8428f, 7.945f, 12.1573f, 8.1649f, 12.3704f)
                lineTo(14.7953f, 18.8001f)
                curveTo(15.2091f, 19.2013f, 16.0f, 18.9581f, 16.0f, 18.4297f)
                verticalLineTo(12.7071f)
                lineTo(11.5956f, 8.3027f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.9999f, 11.2929f)
                lineTo(15.9999f, 5.5703f)
                curveTo(15.9999f, 5.0419f, 15.2089f, 4.7987f, 14.7952f, 5.1999f)
                lineTo(12.3135f, 7.6065f)
                lineTo(15.9999f, 11.2929f)
                close()
            }
        }
            .build()
        return _altArrowLeft!!
    }

private var _altArrowLeft: ImageVector? = null
