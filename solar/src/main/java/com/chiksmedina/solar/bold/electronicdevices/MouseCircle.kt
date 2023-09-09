package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

public val ElectronicDevicesGroup.MouseCircle: ImageVector
    get() {
        if (_mouseCircle != null) {
            return _mouseCircle!!
        }
        _mouseCircle = Builder(name = "MouseCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 21.4534f)
                curveTo(6.7726f, 21.4534f, 2.5349f, 17.1834f, 2.5349f, 11.9161f)
                curveTo(2.5349f, 7.2986f, 5.7922f, 3.4459f, 10.1182f, 2.567f)
                curveTo(10.6454f, 2.4599f, 11.2326f, 2.9023f, 11.2326f, 3.6675f)
                verticalLineTo(5.7297f)
                horizontalLineTo(12.7674f)
                verticalLineTo(3.6675f)
                curveTo(12.7674f, 2.155f, 11.5037f, 0.7078f, 9.8149f, 1.051f)
                curveTo(4.7866f, 2.0725f, 1.0f, 6.5478f, 1.0f, 11.9161f)
                curveTo(1.0f, 18.0375f, 5.9249f, 23.0f, 12.0f, 23.0f)
                curveTo(18.0751f, 23.0f, 23.0f, 18.0375f, 23.0f, 11.9161f)
                curveTo(23.0f, 7.5276f, 20.4689f, 3.7364f, 16.801f, 1.9409f)
                curveTo(16.4197f, 1.7543f, 15.9605f, 1.9144f, 15.7753f, 2.2986f)
                curveTo(15.5901f, 2.6827f, 15.749f, 3.1454f, 16.1303f, 3.332f)
                curveTo(19.2898f, 4.8787f, 21.4651f, 8.1421f, 21.4651f, 11.9161f)
                curveTo(21.4651f, 17.1834f, 17.2274f, 21.4534f, 12.0f, 21.4534f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.907f, 13.9539f)
                curveTo(7.907f, 16.2451f, 9.7395f, 18.1024f, 12.0f, 18.1024f)
                curveTo(14.2605f, 18.1024f, 16.093f, 16.2451f, 16.093f, 13.9539f)
                verticalLineTo(10.5832f)
                horizontalLineTo(7.907f)
                verticalLineTo(13.9539f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7674f, 9.3384f)
                horizontalLineTo(16.0212f)
                curveTo(15.7091f, 7.671f, 14.4125f, 6.046f, 12.7674f, 5.7297f)
                verticalLineTo(9.3384f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2326f, 9.3384f)
                verticalLineTo(5.7297f)
                curveTo(9.5875f, 6.046f, 8.2909f, 7.671f, 7.9788f, 9.3384f)
                horizontalLineTo(11.2326f)
                close()
            }
        }
        .build()
        return _mouseCircle!!
    }

private var _mouseCircle: ImageVector? = null
