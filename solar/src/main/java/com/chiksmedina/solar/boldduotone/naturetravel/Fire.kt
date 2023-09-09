package com.chiksmedina.solar.boldduotone.naturetravel

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
import com.chiksmedina.solar.boldduotone.NatureTravelGroup

public val NatureTravelGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.8324f, 21.8013f)
                curveTo(15.9583f, 21.1747f, 20.0f, 18.926f, 20.0f, 13.1112f)
                curveTo(20.0f, 7.8196f, 16.1267f, 4.2959f, 13.3415f, 2.6769f)
                curveTo(12.7235f, 2.3176f, 12.0f, 2.7901f, 12.0f, 3.5049f)
                verticalLineTo(5.3334f)
                curveTo(12.0f, 6.7753f, 11.3938f, 9.4071f, 9.7093f, 10.5018f)
                curveTo(8.8493f, 11.0607f, 7.9205f, 10.2242f, 7.816f, 9.2039f)
                lineTo(7.7302f, 8.366f)
                curveTo(7.6304f, 7.392f, 6.6384f, 6.8007f, 5.86f, 7.3946f)
                curveTo(4.4615f, 8.4614f, 3.0f, 10.3296f, 3.0f, 13.1112f)
                curveTo(3.0f, 20.2223f, 8.2889f, 22.0001f, 10.9333f, 22.0001f)
                curveTo(11.0871f, 22.0001f, 11.2488f, 21.9955f, 11.4171f, 21.9858f)
                curveTo(11.863f, 21.9296f, 11.4171f, 22.085f, 12.8324f, 21.8013f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 18.4442f)
                curveTo(8.0f, 21.064f, 10.1113f, 21.8742f, 11.4171f, 21.9858f)
                curveTo(11.863f, 21.9296f, 11.4171f, 22.085f, 12.8324f, 21.8013f)
                curveTo(13.871f, 21.4343f, 15.0f, 20.4922f, 15.0f, 18.4442f)
                curveTo(15.0f, 17.1465f, 14.1814f, 16.3459f, 13.5401f, 15.9711f)
                curveTo(13.3439f, 15.8564f, 13.1161f, 16.0008f, 13.0985f, 16.2273f)
                curveTo(13.0429f, 16.9454f, 12.3534f, 17.5174f, 11.8836f, 16.9714f)
                curveTo(11.4685f, 16.4889f, 11.2941f, 15.784f, 11.2941f, 15.3331f)
                verticalLineTo(14.7439f)
                curveTo(11.2941f, 14.3887f, 10.9365f, 14.1533f, 10.631f, 14.3346f)
                curveTo(9.4951f, 15.0085f, 8.0f, 16.3949f, 8.0f, 18.4442f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
