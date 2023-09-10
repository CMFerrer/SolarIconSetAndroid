package com.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = Builder(
            name = "Earth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.5752f, 9.4474f)
                curveTo(8.3879f, 7.3632f, 6.7806f, 5.4211f, 6.0003f, 4.7105f)
                lineTo(5.5693f, 4.3419f)
                curveTo(7.3079f, 2.8804f, 9.5513f, 2.0f, 12.0004f, 2.0f)
                curveTo(14.2137f, 2.0f, 16.2592f, 2.7191f, 17.9158f, 3.9364f)
                curveTo(18.1498f, 4.6469f, 17.704f, 6.1316f, 17.2359f, 6.8421f)
                curveTo(17.0663f, 7.0995f, 16.6818f, 7.419f, 16.2602f, 7.7219f)
                curveTo(15.3097f, 8.4048f, 14.1102f, 8.7425f, 13.5004f, 10.0f)
                curveTo(13.326f, 10.3595f, 13.3335f, 10.7108f, 13.4173f, 11.0163f)
                curveTo(13.4776f, 11.2358f, 13.5161f, 11.4745f, 13.5167f, 11.708f)
                curveTo(13.5187f, 12.4629f, 12.7552f, 13.0082f, 12.0004f, 13.0f)
                curveTo(10.0361f, 12.9786f, 8.7502f, 11.3955f, 8.5752f, 9.4474f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.4365f, 18.2761f)
                curveTo(14.4246f, 16.414f, 17.7182f, 16.414f, 17.7182f, 16.414f)
                curveTo(21.1502f, 16.3782f, 21.6138f, 14.2944f, 21.9237f, 13.2412f)
                curveTo(21.369f, 17.7226f, 17.8494f, 21.2849f, 13.3885f, 21.9046f)
                curveTo(13.0659f, 21.2256f, 12.6837f, 19.6946f, 13.4365f, 18.2761f)
                close()
            }
        }
            .build()
        return _earth!!
    }

private var _earth: ImageVector? = null
