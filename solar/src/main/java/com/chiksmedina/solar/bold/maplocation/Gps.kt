package com.chiksmedina.solar.bold.maplocation

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
import com.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.Gps: ImageVector
    get() {
        if (_gps != null) {
            return _gps!!
        }
        _gps = Builder(
            name = "Gps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 12.3853f, 2.3124f, 12.6977f, 2.6977f, 12.6977f)
                horizontalLineTo(4.5904f)
                curveTo(4.9208f, 16.2509f, 7.7491f, 19.0792f, 11.3023f, 19.4096f)
                verticalLineTo(21.3023f)
                curveTo(11.3023f, 21.6876f, 11.6147f, 22.0f, 12.0f, 22.0f)
                curveTo(12.3853f, 22.0f, 12.6977f, 21.6876f, 12.6977f, 21.3023f)
                verticalLineTo(19.4096f)
                curveTo(16.2509f, 19.0792f, 19.0792f, 16.2509f, 19.4096f, 12.6977f)
                horizontalLineTo(21.3023f)
                curveTo(21.6876f, 12.6977f, 22.0f, 12.3853f, 22.0f, 12.0f)
                curveTo(22.0f, 11.6147f, 21.6876f, 11.3023f, 21.3023f, 11.3023f)
                horizontalLineTo(19.4096f)
                curveTo(19.0792f, 7.7491f, 16.2509f, 4.9208f, 12.6977f, 4.5904f)
                verticalLineTo(2.6977f)
                curveTo(12.6977f, 2.3124f, 12.3853f, 2.0f, 12.0f, 2.0f)
                curveTo(11.6147f, 2.0f, 11.3023f, 2.3124f, 11.3023f, 2.6977f)
                verticalLineTo(4.5904f)
                curveTo(7.7491f, 4.9208f, 4.9208f, 7.7491f, 4.5904f, 11.3023f)
                horizontalLineTo(2.6977f)
                curveTo(2.3124f, 11.3023f, 2.0f, 11.6147f, 2.0f, 12.0f)
                close()
                moveTo(8.5116f, 12.0f)
                curveTo(8.5116f, 10.0734f, 10.0734f, 8.5116f, 12.0f, 8.5116f)
                curveTo(13.9266f, 8.5116f, 15.4884f, 10.0734f, 15.4884f, 12.0f)
                curveTo(15.4884f, 13.9266f, 13.9266f, 15.4884f, 12.0f, 15.4884f)
                curveTo(10.0734f, 15.4884f, 8.5116f, 13.9266f, 8.5116f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.907f, 12.0f)
                curveTo(9.907f, 10.8441f, 10.8441f, 9.907f, 12.0f, 9.907f)
                curveTo(13.1559f, 9.907f, 14.093f, 10.8441f, 14.093f, 12.0f)
                curveTo(14.093f, 13.1559f, 13.1559f, 14.093f, 12.0f, 14.093f)
                curveTo(10.8441f, 14.093f, 9.907f, 13.1559f, 9.907f, 12.0f)
                close()
            }
        }
            .build()
        return _gps!!
    }

private var _gps: ImageVector? = null
