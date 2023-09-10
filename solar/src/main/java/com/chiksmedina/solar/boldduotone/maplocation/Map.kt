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

val MapLocationGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(
            name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 8.7094f)
                verticalLineTo(16.8377f)
                curveTo(3.0f, 17.8813f, 3.0f, 18.4031f, 3.2831f, 18.7959f)
                curveTo(3.5663f, 19.1888f, 4.0613f, 19.3538f, 5.0513f, 19.6838f)
                lineTo(6.2161f, 20.072f)
                curveTo(7.5832f, 20.5277f, 8.2667f, 20.7556f, 8.9549f, 20.6634f)
                curveTo(8.97f, 20.6614f, 8.985f, 20.6593f, 9.0f, 20.6569f)
                verticalLineTo(6.6571f)
                curveTo(8.8871f, 6.6739f, 8.7733f, 6.6843f, 8.6591f, 6.6882f)
                curveTo(8.1199f, 6.7066f, 7.5863f, 6.5288f, 6.519f, 6.173f)
                curveTo(5.1211f, 5.707f, 4.4221f, 5.4741f, 3.8903f, 5.7107f)
                curveTo(3.7015f, 5.7947f, 3.532f, 5.9168f, 3.3926f, 6.0693f)
                curveTo(3.0f, 6.4991f, 3.0f, 7.2358f, 3.0f, 8.7094f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 15.2907f)
                verticalLineTo(7.1623f)
                curveTo(21.0f, 6.1187f, 21.0f, 5.5969f, 20.7169f, 5.2041f)
                curveTo(20.4337f, 4.8113f, 19.9387f, 4.6462f, 18.9487f, 4.3162f)
                lineTo(17.7839f, 3.928f)
                curveTo(16.4168f, 3.4723f, 15.7333f, 3.2444f, 15.0451f, 3.3366f)
                curveTo(15.03f, 3.3386f, 15.015f, 3.3408f, 15.0f, 3.3431f)
                verticalLineTo(17.343f)
                curveTo(15.1129f, 17.3261f, 15.2267f, 17.3157f, 15.3409f, 17.3118f)
                curveTo(15.8801f, 17.2934f, 16.4137f, 17.4713f, 17.481f, 17.827f)
                curveTo(18.8789f, 18.293f, 19.5779f, 18.526f, 20.1097f, 18.2894f)
                curveTo(20.2985f, 18.2054f, 20.468f, 18.0833f, 20.6074f, 17.9307f)
                curveTo(21.0f, 17.501f, 21.0f, 16.7642f, 21.0f, 15.2907f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.2469f, 6.6092f)
                curveTo(9.1652f, 6.6285f, 9.0829f, 6.6444f, 9.0f, 6.6567f)
                verticalLineTo(20.6566f)
                curveTo(9.6696f, 20.5533f, 10.2689f, 20.1538f, 11.4416f, 19.3719f)
                lineTo(12.824f, 18.4503f)
                curveTo(13.7601f, 17.8263f, 14.2281f, 17.5143f, 14.7532f, 17.3902f)
                curveTo(14.8348f, 17.3709f, 14.9171f, 17.355f, 15.0f, 17.3427f)
                verticalLineTo(3.3428f)
                curveTo(14.3304f, 3.4461f, 13.7311f, 3.8456f, 12.5583f, 4.6275f)
                lineTo(11.176f, 5.549f)
                curveTo(10.2399f, 6.1731f, 9.7719f, 6.4851f, 9.2469f, 6.6092f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.481f, 17.8267f)
                curveTo(17.5684f, 17.8558f, 17.653f, 17.884f, 17.735f, 17.9113f)
                close()
            }
        }
            .build()
        return _map!!
    }

private var _map: ImageVector? = null
