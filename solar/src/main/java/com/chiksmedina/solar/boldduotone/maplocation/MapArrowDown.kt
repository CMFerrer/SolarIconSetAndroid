package com.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.MapArrowDown: ImageVector
    get() {
        if (_mapArrowDown != null) {
            return _mapArrowDown!!
        }
        _mapArrowDown = Builder(
            name = "MapArrowDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0374f, 14.1437f)
                curveTo(7.7827f, 14.2711f, 7.4731f, 14.1602f, 7.3571f, 13.9001f)
                lineTo(3.1645f, 4.4984f)
                curveTo(2.4974f, 3.0026f, 3.9787f, 1.451f, 5.3664f, 2.192f)
                lineTo(11.2701f, 5.344f)
                curveTo(11.7293f, 5.5891f, 12.2697f, 5.5891f, 12.7289f, 5.344f)
                lineTo(18.6326f, 2.192f)
                curveTo(20.0204f, 1.451f, 21.5016f, 3.0026f, 20.8346f, 4.4984f)
                lineTo(19.2629f, 8.0227f)
                curveTo(19.0743f, 8.4456f, 18.7448f, 8.79f, 18.3307f, 8.997f)
                lineTo(8.0374f, 14.1437f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.609f, 15.5342f)
                curveTo(8.3697f, 15.6538f, 8.267f, 15.9407f, 8.376f, 16.185f)
                lineTo(10.5266f, 21.0076f)
                curveTo(11.1169f, 22.3314f, 12.8813f, 22.3314f, 13.4717f, 21.0076f)
                lineTo(17.4396f, 12.1099f)
                curveTo(17.6308f, 11.6812f, 17.1792f, 11.2491f, 16.7593f, 11.459f)
                lineTo(8.609f, 15.5342f)
                close()
            }
        }
            .build()
        return _mapArrowDown!!
    }

private var _mapArrowDown: ImageVector? = null
