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

val DesignToolsGroup.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) {
            return _alignLeft!!
        }
        _alignLeft = Builder(
            name = "AlignLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.375f, 7.875f)
                curveTo(7.375f, 6.9404f, 7.375f, 6.4731f, 7.576f, 6.125f)
                curveTo(7.7076f, 5.897f, 7.897f, 5.7076f, 8.125f, 5.576f)
                curveTo(8.4731f, 5.375f, 8.9404f, 5.375f, 9.875f, 5.375f)
                lineTo(18.875f, 5.375f)
                curveTo(19.8096f, 5.375f, 20.2769f, 5.375f, 20.625f, 5.576f)
                curveTo(20.853f, 5.7076f, 21.0424f, 5.897f, 21.174f, 6.125f)
                curveTo(21.375f, 6.4731f, 21.375f, 6.9404f, 21.375f, 7.875f)
                curveTo(21.375f, 8.8096f, 21.375f, 9.2769f, 21.174f, 9.625f)
                curveTo(21.0424f, 9.853f, 20.853f, 10.0424f, 20.625f, 10.174f)
                curveTo(20.2769f, 10.375f, 19.8096f, 10.375f, 18.875f, 10.375f)
                lineTo(9.875f, 10.375f)
                curveTo(8.9404f, 10.375f, 8.4731f, 10.375f, 8.125f, 10.174f)
                curveTo(7.897f, 10.0424f, 7.7076f, 9.853f, 7.576f, 9.625f)
                curveTo(7.375f, 9.2769f, 7.375f, 8.8096f, 7.375f, 7.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.375f, 16.875f)
                curveTo(7.375f, 15.9404f, 7.375f, 15.4731f, 7.576f, 15.125f)
                curveTo(7.7076f, 14.897f, 7.897f, 14.7076f, 8.125f, 14.576f)
                curveTo(8.4731f, 14.375f, 8.9404f, 14.375f, 9.875f, 14.375f)
                horizontalLineTo(15.875f)
                curveTo(16.8096f, 14.375f, 17.2769f, 14.375f, 17.625f, 14.576f)
                curveTo(17.853f, 14.7076f, 18.0424f, 14.897f, 18.174f, 15.125f)
                curveTo(18.375f, 15.4731f, 18.375f, 15.9404f, 18.375f, 16.875f)
                curveTo(18.375f, 17.8096f, 18.375f, 18.2769f, 18.174f, 18.625f)
                curveTo(18.0424f, 18.853f, 17.853f, 19.0424f, 17.625f, 19.174f)
                curveTo(17.2769f, 19.375f, 16.8096f, 19.375f, 15.875f, 19.375f)
                horizontalLineTo(9.875f)
                curveTo(8.9404f, 19.375f, 8.4731f, 19.375f, 8.125f, 19.174f)
                curveTo(7.897f, 19.0424f, 7.7076f, 18.853f, 7.576f, 18.625f)
                curveTo(7.375f, 18.2769f, 7.375f, 17.8096f, 7.375f, 16.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(3.375f, 23.125f)
                curveTo(3.7892f, 23.125f, 4.125f, 22.7892f, 4.125f, 22.375f)
                lineTo(4.125f, 2.375f)
                curveTo(4.125f, 1.9608f, 3.7892f, 1.625f, 3.375f, 1.625f)
                curveTo(2.9608f, 1.625f, 2.625f, 1.9608f, 2.625f, 2.375f)
                lineTo(2.625f, 22.375f)
                curveTo(2.625f, 22.7892f, 2.9608f, 23.125f, 3.375f, 23.125f)
                close()
            }
        }
            .build()
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
