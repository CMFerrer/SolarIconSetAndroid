package dev.chiksmedina.solar.boldduotone.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.HomeFurnitureGroup

val HomeFurnitureGroup.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(
            name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0024f, 12.2665f)
                curveTo(2.6221f, 12.4854f, 2.322f, 12.8248f, 2.1522f, 13.2346f)
                curveTo(2.0f, 13.6022f, 2.0f, 14.0681f, 2.0f, 15.0f)
                curveTo(2.0f, 15.9319f, 2.0f, 16.3978f, 2.1522f, 16.7654f)
                curveTo(2.3552f, 17.2554f, 2.7446f, 17.6448f, 3.2346f, 17.8478f)
                curveTo(3.487f, 17.9523f, 3.7858f, 17.9851f, 4.25f, 17.9953f)
                verticalLineTo(20.0f)
                curveTo(4.25f, 20.4142f, 4.5858f, 20.75f, 5.0f, 20.75f)
                curveTo(5.4142f, 20.75f, 5.75f, 20.4142f, 5.75f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.25f)
                verticalLineTo(20.0f)
                curveTo(18.25f, 20.4142f, 18.5858f, 20.75f, 19.0f, 20.75f)
                curveTo(19.4142f, 20.75f, 19.75f, 20.4142f, 19.75f, 20.0f)
                verticalLineTo(17.9953f)
                curveTo(20.2142f, 17.9851f, 20.513f, 17.9523f, 20.7654f, 17.8478f)
                curveTo(21.2554f, 17.6448f, 21.6448f, 17.2554f, 21.8478f, 16.7654f)
                curveTo(22.0f, 16.3978f, 22.0f, 15.9319f, 22.0f, 15.0f)
                curveTo(22.0f, 14.0681f, 22.0f, 13.6022f, 21.8478f, 13.2346f)
                curveTo(21.678f, 12.8248f, 21.3779f, 12.4854f, 20.9976f, 12.2666f)
                lineTo(19.25f, 12.0001f)
                lineTo(19.0f, 12.0f)
                horizontalLineTo(5.0f)
                lineTo(4.75f, 12.0001f)
                lineTo(3.0024f, 12.2665f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.9976f, 4.0f)
                horizontalLineTo(12.9976f)
                curveTo(16.7688f, 4.0f, 18.6544f, 4.0f, 19.826f, 5.1716f)
                curveTo(20.8485f, 6.194f, 20.9786f, 7.7604f, 20.9952f, 10.6494f)
                verticalLineTo(12.2662f)
                lineTo(19.25f, 12.0001f)
                horizontalLineTo(4.75f)
                lineTo(3.0024f, 12.2665f)
                lineTo(3.0f, 12.2679f)
                verticalLineTo(10.6494f)
                curveTo(3.0166f, 7.7604f, 3.1467f, 6.194f, 4.1692f, 5.1716f)
                curveTo(5.3407f, 4.0f, 7.2263f, 4.0f, 10.9976f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 10.5f)
                curveTo(19.0f, 9.3135f, 18.9981f, 8.5165f, 18.919f, 7.922f)
                curveTo(18.8435f, 7.3541f, 18.7129f, 7.111f, 18.5543f, 6.9506f)
                curveTo(18.3956f, 6.7902f, 18.1552f, 6.6582f, 17.5934f, 6.5819f)
                curveTo(17.0054f, 6.502f, 16.2171f, 6.5f, 15.0435f, 6.5f)
                horizontalLineTo(12.913f)
                verticalLineTo(10.5f)
                lineTo(19.0f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.087f, 10.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(8.9565f)
                curveTo(7.7829f, 6.5f, 6.9946f, 6.502f, 6.4066f, 6.5819f)
                curveTo(5.8448f, 6.6582f, 5.6044f, 6.7902f, 5.4457f, 6.9506f)
                curveTo(5.2871f, 7.111f, 5.1565f, 7.3541f, 5.081f, 7.922f)
                curveTo(5.0019f, 8.5165f, 5.0f, 9.3135f, 5.0f, 10.5f)
                lineTo(11.087f, 10.5f)
                close()
            }
        }
            .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
