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

val ArrowsGroup.RoundArrowRight: ImageVector
    get() {
        if (_roundArrowRight != null) {
            return _roundArrowRight!!
        }
        _roundArrowRight = Builder(
            name = "RoundArrowRight", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.5303f, 8.4697f)
                curveTo(13.2374f, 8.1768f, 12.7626f, 8.1768f, 12.4697f, 8.4697f)
                curveTo(12.1768f, 8.7626f, 12.1768f, 9.2374f, 12.4697f, 9.5303f)
                lineTo(14.1893f, 11.25f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 11.25f, 7.25f, 11.5858f, 7.25f, 12.0f)
                curveTo(7.25f, 12.4142f, 7.5858f, 12.75f, 8.0f, 12.75f)
                horizontalLineTo(14.1893f)
                lineTo(12.4697f, 14.4697f)
                curveTo(12.1768f, 14.7626f, 12.1768f, 15.2374f, 12.4697f, 15.5303f)
                curveTo(12.7626f, 15.8232f, 13.2374f, 15.8232f, 13.5303f, 15.5303f)
                lineTo(16.5303f, 12.5303f)
                curveTo(16.8232f, 12.2374f, 16.8232f, 11.7626f, 16.5303f, 11.4697f)
                lineTo(13.5303f, 8.4697f)
                close()
            }
        }
            .build()
        return _roundArrowRight!!
    }

private var _roundArrowRight: ImageVector? = null
