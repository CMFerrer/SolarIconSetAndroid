package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.ForbiddenCircle: ImageVector
    get() {
        if (_forbiddenCircle != null) {
            return _forbiddenCircle!!
        }
        _forbiddenCircle = Builder(
            name = "ForbiddenCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.9289f, 4.9289f)
                curveTo(1.0237f, 8.8342f, 1.0237f, 15.1658f, 4.9289f, 19.0711f)
                curveTo(8.8342f, 22.9763f, 15.1656f, 22.9761f, 19.0708f, 19.0708f)
                curveTo(22.9761f, 15.1656f, 22.9763f, 8.8342f, 19.0711f, 4.9289f)
                curveTo(15.1658f, 1.0237f, 8.8342f, 1.0237f, 4.9289f, 4.9289f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.5213f, 4.4183f)
                lineTo(4.4182f, 18.5212f)
                curveTo(4.5803f, 18.7092f, 4.7505f, 18.8927f, 4.9289f, 19.0711f)
                curveTo(5.1073f, 19.2495f, 5.2908f, 19.4197f, 5.4789f, 19.5818f)
                lineTo(19.5819f, 5.479f)
                curveTo(19.4198f, 5.2909f, 19.2495f, 5.1074f, 19.0711f, 4.9289f)
                curveTo(18.8927f, 4.7506f, 18.7093f, 4.5804f, 18.5213f, 4.4183f)
                close()
            }
        }
            .build()
        return _forbiddenCircle!!
    }

private var _forbiddenCircle: ImageVector? = null
