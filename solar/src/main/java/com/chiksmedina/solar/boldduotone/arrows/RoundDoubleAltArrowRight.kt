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

val ArrowsGroup.RoundDoubleAltArrowRight: ImageVector
    get() {
        if (_roundDoubleAltArrowRight != null) {
            return _roundDoubleAltArrowRight!!
        }
        _roundDoubleAltArrowRight = Builder(
            name = "RoundDoubleAltArrowRight", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0303f, 15.5303f)
                curveTo(8.7374f, 15.8232f, 8.2626f, 15.8232f, 7.9697f, 15.5303f)
                curveTo(7.6768f, 15.2374f, 7.6768f, 14.7626f, 7.9697f, 14.4697f)
                lineTo(10.4393f, 12.0f)
                lineTo(7.9697f, 9.5303f)
                curveTo(7.6768f, 9.2374f, 7.6768f, 8.7626f, 7.9697f, 8.4697f)
                curveTo(8.2626f, 8.1768f, 8.7374f, 8.1768f, 9.0303f, 8.4697f)
                lineTo(12.0303f, 11.4697f)
                curveTo(12.3232f, 11.7626f, 12.3232f, 12.2374f, 12.0303f, 12.5303f)
                lineTo(9.0303f, 15.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0303f, 15.5303f)
                curveTo(12.7374f, 15.8232f, 12.2626f, 15.8232f, 11.9697f, 15.5303f)
                curveTo(11.6768f, 15.2374f, 11.6768f, 14.7626f, 11.9697f, 14.4697f)
                lineTo(14.4393f, 12.0f)
                lineTo(11.9697f, 9.5303f)
                curveTo(11.6768f, 9.2374f, 11.6768f, 8.7626f, 11.9697f, 8.4697f)
                curveTo(12.2626f, 8.1768f, 12.7374f, 8.1768f, 13.0303f, 8.4697f)
                lineTo(16.0303f, 11.4697f)
                curveTo(16.3232f, 11.7626f, 16.3232f, 12.2374f, 16.0303f, 12.5303f)
                lineTo(13.0303f, 15.5303f)
                close()
            }
        }
            .build()
        return _roundDoubleAltArrowRight!!
    }

private var _roundDoubleAltArrowRight: ImageVector? = null
