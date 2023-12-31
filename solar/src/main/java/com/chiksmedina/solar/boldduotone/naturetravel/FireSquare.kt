package com.chiksmedina.solar.boldduotone.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.NatureTravelGroup

val NatureTravelGroup.FireSquare: ImageVector
    get() {
        if (_fireSquare != null) {
            return _fireSquare!!
        }
        _fireSquare = Builder(
            name = "FireSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 12.6666f)
                curveTo(17.0f, 16.9333f, 13.4444f, 18.0f, 11.6667f, 18.0f)
                curveTo(10.1111f, 18.0f, 7.0f, 16.9333f, 7.0f, 12.6666f)
                curveTo(7.0f, 10.8109f, 8.0629f, 9.6327f, 8.9559f, 9.0397f)
                curveTo(9.3642f, 8.7686f, 9.872f, 8.9419f, 9.8984f, 9.4312f)
                curveTo(9.9562f, 10.502f, 10.7814f, 11.3622f, 11.4205f, 10.5011f)
                curveTo(12.0054f, 9.7129f, 12.2941f, 8.6427f, 12.2941f, 7.9999f)
                curveTo(12.2941f, 7.0532f, 13.2525f, 6.4515f, 14.0008f, 7.0316f)
                curveTo(15.4593f, 8.1622f, 17.0f, 10.0558f, 17.0f, 12.6666f)
                close()
            }
        }
            .build()
        return _fireSquare!!
    }

private var _fireSquare: ImageVector? = null
