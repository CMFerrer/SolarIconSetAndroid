package com.chiksmedina.solar.broken.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.HomeFurnitureGroup

val HomeFurnitureGroup.Mirror: ImageVector
    get() {
        if (_mirror != null) {
            return _mirror!!
        }
        _mirror = Builder(
            name = "Mirror", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 9.5f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 19.6491f, 4.7895f, 20.2807f, 4.4f, 20.8f)
                lineTo(3.5f, 22.0f)
                moveTo(19.0f, 9.5f)
                verticalLineTo(19.0f)
                curveTo(19.0f, 19.6491f, 19.2105f, 20.2807f, 19.6f, 20.8f)
                lineTo(20.5f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.3414f, 7.0f)
                curveTo(6.1203f, 7.7819f, 6.0f, 8.6234f, 6.0f, 9.5f)
                curveTo(6.0f, 13.6421f, 8.6863f, 17.0f, 12.0f, 17.0f)
                curveTo(15.3137f, 17.0f, 18.0f, 13.6421f, 18.0f, 9.5f)
                curveTo(18.0f, 5.3579f, 15.3137f, 2.0f, 12.0f, 2.0f)
                curveTo(10.9091f, 2.0f, 9.8861f, 2.3639f, 9.0047f, 3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 20.0f)
                horizontalLineTo(12.0f)
                moveTo(19.0f, 20.0f)
                horizontalLineTo(16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 5.2561f)
                curveTo(13.9608f, 5.7655f, 14.697f, 6.9883f, 14.9257f, 8.5002f)
            }
        }
            .build()
        return _mirror!!
    }

private var _mirror: ImageVector? = null
