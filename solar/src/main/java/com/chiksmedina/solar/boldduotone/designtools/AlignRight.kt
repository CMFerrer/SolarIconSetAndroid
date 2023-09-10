package com.chiksmedina.solar.boldduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

val DesignToolsGroup.AlignRight: ImageVector
    get() {
        if (_alignRight != null) {
            return _alignRight!!
        }
        _alignRight = Builder(
            name = "AlignRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.625f, 7.875f)
                curveTo(16.625f, 6.9404f, 16.625f, 6.4731f, 16.424f, 6.125f)
                curveTo(16.2924f, 5.897f, 16.103f, 5.7076f, 15.875f, 5.576f)
                curveTo(15.5269f, 5.375f, 15.0596f, 5.375f, 14.125f, 5.375f)
                lineTo(5.125f, 5.375f)
                curveTo(4.1904f, 5.375f, 3.7231f, 5.375f, 3.375f, 5.576f)
                curveTo(3.147f, 5.7076f, 2.9576f, 5.897f, 2.826f, 6.125f)
                curveTo(2.625f, 6.4731f, 2.625f, 6.9404f, 2.625f, 7.875f)
                curveTo(2.625f, 8.8096f, 2.625f, 9.2769f, 2.826f, 9.625f)
                curveTo(2.9576f, 9.853f, 3.147f, 10.0424f, 3.375f, 10.174f)
                curveTo(3.7231f, 10.375f, 4.1904f, 10.375f, 5.125f, 10.375f)
                lineTo(14.125f, 10.375f)
                curveTo(15.0596f, 10.375f, 15.5269f, 10.375f, 15.875f, 10.174f)
                curveTo(16.103f, 10.0424f, 16.2924f, 9.853f, 16.424f, 9.625f)
                curveTo(16.625f, 9.2769f, 16.625f, 8.8096f, 16.625f, 7.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.625f, 16.875f)
                curveTo(16.625f, 15.9404f, 16.625f, 15.4731f, 16.424f, 15.125f)
                curveTo(16.2924f, 14.897f, 16.103f, 14.7076f, 15.875f, 14.576f)
                curveTo(15.5269f, 14.375f, 15.0596f, 14.375f, 14.125f, 14.375f)
                horizontalLineTo(8.125f)
                curveTo(7.1904f, 14.375f, 6.7231f, 14.375f, 6.375f, 14.576f)
                curveTo(6.147f, 14.7076f, 5.9576f, 14.897f, 5.826f, 15.125f)
                curveTo(5.625f, 15.4731f, 5.625f, 15.9404f, 5.625f, 16.875f)
                curveTo(5.625f, 17.8096f, 5.625f, 18.2769f, 5.826f, 18.625f)
                curveTo(5.9576f, 18.853f, 6.147f, 19.0424f, 6.375f, 19.174f)
                curveTo(6.7231f, 19.375f, 7.1904f, 19.375f, 8.125f, 19.375f)
                horizontalLineTo(14.125f)
                curveTo(15.0596f, 19.375f, 15.5269f, 19.375f, 15.875f, 19.174f)
                curveTo(16.103f, 19.0424f, 16.2924f, 18.853f, 16.424f, 18.625f)
                curveTo(16.625f, 18.2769f, 16.625f, 17.8096f, 16.625f, 16.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(20.625f, 23.125f)
                curveTo(20.2108f, 23.125f, 19.875f, 22.7892f, 19.875f, 22.375f)
                lineTo(19.875f, 2.375f)
                curveTo(19.875f, 1.9608f, 20.2108f, 1.625f, 20.625f, 1.625f)
                curveTo(21.0392f, 1.625f, 21.375f, 1.9608f, 21.375f, 2.375f)
                lineTo(21.375f, 22.375f)
                curveTo(21.375f, 22.7892f, 21.0392f, 23.125f, 20.625f, 23.125f)
                close()
            }
        }
            .build()
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
