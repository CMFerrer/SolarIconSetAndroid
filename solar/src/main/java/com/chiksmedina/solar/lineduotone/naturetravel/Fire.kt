package com.chiksmedina.solar.lineduotone.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.NatureTravelGroup

public val NatureTravelGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 13.1111f)
                curveTo(20.0f, 20.2222f, 13.9556f, 22.0f, 10.9333f, 22.0f)
                curveTo(8.2889f, 22.0f, 3.0f, 20.2222f, 3.0f, 13.1111f)
                curveTo(3.0f, 10.3295f, 4.4615f, 8.4614f, 5.86f, 7.3945f)
                curveTo(6.6384f, 6.8007f, 7.6304f, 7.392f, 7.7302f, 8.366f)
                lineTo(7.816f, 9.2038f)
                curveTo(7.9205f, 10.2241f, 8.8493f, 11.0606f, 9.7093f, 10.5017f)
                curveTo(11.3938f, 9.4071f, 12.0f, 6.7752f, 12.0f, 5.3333f)
                verticalLineTo(5.0097f)
                curveTo(12.0f, 3.58f, 13.4438f, 2.6598f, 14.6023f, 3.4977f)
                curveTo(17.1653f, 5.3513f, 20.0f, 8.5843f, 20.0f, 13.1111f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 18.4445f)
                curveTo(8.0f, 21.2889f, 10.4889f, 22.0f, 11.7333f, 22.0f)
                curveTo(12.8222f, 22.0f, 15.0f, 21.2889f, 15.0f, 18.4445f)
                curveTo(15.0f, 17.3435f, 14.4107f, 16.6002f, 13.8404f, 16.1713f)
                curveTo(13.4424f, 15.872f, 12.8828f, 16.1408f, 12.7459f, 16.6196f)
                curveTo(12.5675f, 17.2437f, 11.9228f, 17.636f, 11.5944f, 17.0759f)
                curveTo(11.2941f, 16.5638f, 11.2941f, 15.7957f, 11.2941f, 15.3334f)
                curveTo(11.2941f, 14.6968f, 10.6539f, 14.2847f, 10.1389f, 14.6589f)
                curveTo(9.1065f, 15.4091f, 8.0f, 16.6815f, 8.0f, 18.4445f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
