package com.chiksmedina.solar.lineduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.DesignToolsGroup

val DesignToolsGroup.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) {
            return _flipVertical!!
        }
        _flipVertical = Builder(
            name = "FlipVertical", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.8864f, 2.0f)
                lineTo(18.1137f, 2.0f)
                curveTo(19.8158f, 2.0f, 20.6669f, 2.0f, 20.946f, 2.5424f)
                curveTo(21.2251f, 3.0848f, 20.7305f, 3.7774f, 19.7411f, 5.1625f)
                lineTo(18.6117f, 6.7437f)
                curveTo(18.1718f, 7.3596f, 17.9518f, 7.6675f, 17.6288f, 7.8337f)
                curveTo(17.3057f, 8.0f, 16.9273f, 8.0f, 16.1705f, 8.0f)
                lineTo(7.8296f, 8.0f)
                curveTo(7.0728f, 8.0f, 6.6943f, 8.0f, 6.3713f, 7.8337f)
                curveTo(6.0482f, 7.6675f, 5.8283f, 7.3596f, 5.3884f, 6.7437f)
                lineTo(4.2589f, 5.1625f)
                curveTo(3.2696f, 3.7774f, 2.7749f, 3.0848f, 3.054f, 2.5424f)
                curveTo(3.3332f, 2.0f, 4.1843f, 2.0f, 5.8864f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.8864f, 22.0f)
                lineTo(18.1136f, 22.0f)
                curveTo(19.8158f, 22.0f, 20.6669f, 22.0f, 20.946f, 21.4576f)
                curveTo(21.2251f, 20.9152f, 20.7305f, 20.2226f, 19.7411f, 18.8375f)
                lineTo(18.6117f, 17.2563f)
                curveTo(18.1718f, 16.6404f, 17.9518f, 16.3325f, 17.6288f, 16.1662f)
                curveTo(17.3057f, 16.0f, 16.9273f, 16.0f, 16.1705f, 16.0f)
                lineTo(7.8296f, 16.0f)
                curveTo(7.0728f, 16.0f, 6.6943f, 16.0f, 6.3713f, 16.1662f)
                curveTo(6.0482f, 16.3325f, 5.8283f, 16.6404f, 5.3884f, 17.2563f)
                lineTo(4.2589f, 18.8375f)
                curveTo(3.2696f, 20.2226f, 2.7749f, 20.9152f, 3.054f, 21.4576f)
                curveTo(3.3332f, 22.0f, 4.1843f, 22.0f, 5.8864f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 12.0f)
                lineTo(14.0f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 12.0f)
                lineTo(22.0f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                lineTo(6.0f, 12.0f)
            }
        }
            .build()
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
