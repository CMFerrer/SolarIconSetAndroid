package com.chiksmedina.solar.lineduotone.designtools

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
import com.chiksmedina.solar.lineduotone.DesignToolsGroup

public val DesignToolsGroup.Pallete2: ImageVector
    get() {
        if (_pallete2 != null) {
            return _pallete2!!
        }
        _pallete2 = Builder(name = "Pallete2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0261f)
                curveTo(2.0f, 17.1723f, 5.8671f, 21.413f, 10.8468f, 21.9863f)
                curveTo(11.5816f, 22.0709f, 12.2938f, 21.7576f, 12.8168f, 21.2333f)
                curveTo(13.4703f, 20.5781f, 13.4703f, 19.5159f, 12.8168f, 18.8607f)
                curveTo(12.2938f, 18.3364f, 11.8674f, 17.5541f, 12.2619f, 16.9268f)
                curveTo(13.8385f, 14.4192f, 22.0f, 20.178f, 22.0f, 12.0261f)
                curveTo(22.0f, 6.4888f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4888f, 2.0f, 12.0261f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 11.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 11.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                curveTo(11.0f, 7.8284f, 10.3284f, 8.5f, 9.5f, 8.5f)
                curveTo(8.6716f, 8.5f, 8.0f, 7.8284f, 8.0f, 7.0f)
                curveTo(8.0f, 6.1716f, 8.6716f, 5.5f, 9.5f, 5.5f)
                curveTo(10.3284f, 5.5f, 11.0f, 6.1716f, 11.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                curveTo(16.0f, 7.8284f, 15.3284f, 8.5f, 14.5f, 8.5f)
                curveTo(13.6716f, 8.5f, 13.0f, 7.8284f, 13.0f, 7.0f)
                curveTo(13.0f, 6.1716f, 13.6716f, 5.5f, 14.5f, 5.5f)
                curveTo(15.3284f, 5.5f, 16.0f, 6.1716f, 16.0f, 7.0f)
                close()
            }
        }
        .build()
        return _pallete2!!
    }

private var _pallete2: ImageVector? = null
