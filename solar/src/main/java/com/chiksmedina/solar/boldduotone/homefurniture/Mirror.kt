package com.chiksmedina.solar.boldduotone.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.HomeFurnitureGroup

public val HomeFurnitureGroup.Mirror: ImageVector
    get() {
        if (_mirror != null) {
            return _mirror!!
        }
        _mirror = Builder(name = "Mirror", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.25f, 8.75f)
                curveTo(5.6643f, 8.75f, 6.0f, 9.0858f, 6.0f, 9.5f)
                verticalLineTo(19.0f)
                curveTo(6.0f, 19.0836f, 5.9973f, 19.167f, 5.9917f, 19.25f)
                horizontalLineTo(18.5084f)
                curveTo(18.5028f, 19.167f, 18.5f, 19.0836f, 18.5f, 19.0f)
                verticalLineTo(9.5f)
                curveTo(18.5f, 9.0858f, 18.8358f, 8.75f, 19.25f, 8.75f)
                curveTo(19.6643f, 8.75f, 20.0f, 9.0858f, 20.0f, 9.5f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 19.4868f, 20.1579f, 19.9605f, 20.45f, 20.35f)
                lineTo(21.35f, 21.55f)
                curveTo(21.5986f, 21.8814f, 21.5314f, 22.3515f, 21.2f, 22.6f)
                curveTo(20.8687f, 22.8485f, 20.3986f, 22.7814f, 20.15f, 22.45f)
                lineTo(19.25f, 21.25f)
                curveTo(19.1309f, 21.0912f, 19.0252f, 20.9239f, 18.9334f, 20.75f)
                horizontalLineTo(5.5667f)
                curveTo(5.4749f, 20.9239f, 5.3692f, 21.0912f, 5.25f, 21.25f)
                lineTo(4.35f, 22.45f)
                curveTo(4.1015f, 22.7814f, 3.6314f, 22.8485f, 3.3f, 22.6f)
                curveTo(2.9687f, 22.3515f, 2.9015f, 21.8814f, 3.15f, 21.55f)
                lineTo(4.05f, 20.35f)
                curveTo(4.3421f, 19.9605f, 4.5f, 19.4868f, 4.5f, 19.0f)
                verticalLineTo(9.5f)
                curveTo(4.5f, 9.0858f, 4.8358f, 8.75f, 5.25f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.25f, 17.0f)
                curveTo(16.116f, 17.0f, 19.25f, 13.6421f, 19.25f, 9.5f)
                curveTo(19.25f, 5.3579f, 16.116f, 2.0f, 12.25f, 2.0f)
                curveTo(8.384f, 2.0f, 5.25f, 5.3579f, 5.25f, 9.5f)
                curveTo(5.25f, 13.6421f, 8.384f, 17.0f, 12.25f, 17.0f)
                close()
                moveTo(13.8267f, 4.5934f)
                curveTo(13.3997f, 4.3994f, 12.8701f, 4.5387f, 12.6438f, 4.9047f)
                curveTo(12.4174f, 5.2707f, 12.58f, 5.7246f, 13.007f, 5.9186f)
                curveTo(13.7988f, 6.2785f, 14.5563f, 7.2407f, 14.7983f, 8.6123f)
                curveTo(14.8706f, 9.0219f, 15.3165f, 9.3037f, 15.7943f, 9.2417f)
                curveTo(16.2721f, 9.1798f, 16.6009f, 8.7976f, 16.5286f, 8.388f)
                curveTo(16.2371f, 6.7357f, 15.2768f, 5.2524f, 13.8267f, 4.5934f)
                close()
            }
        }
        .build()
        return _mirror!!
    }

private var _mirror: ImageVector? = null
