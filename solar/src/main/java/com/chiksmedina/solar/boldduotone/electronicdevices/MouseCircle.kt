package com.chiksmedina.solar.boldduotone.electronicdevices

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
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.MouseCircle: ImageVector
    get() {
        if (_mouseCircle != null) {
            return _mouseCircle!!
        }
        _mouseCircle = Builder(name = "MouseCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5349f, 11.9161f)
                curveTo(2.5349f, 17.1834f, 6.7726f, 21.4534f, 12.0f, 21.4534f)
                curveTo(17.2274f, 21.4534f, 21.4651f, 17.1834f, 21.4651f, 11.9161f)
                curveTo(21.4651f, 8.1421f, 19.2898f, 4.8787f, 16.1303f, 3.332f)
                curveTo(15.749f, 3.1454f, 15.5901f, 2.6827f, 15.7753f, 2.2986f)
                curveTo(15.9605f, 1.9144f, 16.4197f, 1.7543f, 16.801f, 1.9409f)
                curveTo(20.4689f, 3.7364f, 23.0f, 7.5276f, 23.0f, 11.9161f)
                curveTo(23.0f, 18.0375f, 18.0751f, 23.0f, 12.0f, 23.0f)
                curveTo(5.9249f, 23.0f, 1.0f, 18.0375f, 1.0f, 11.9161f)
                curveTo(1.0f, 6.5478f, 4.7866f, 2.0725f, 9.8149f, 1.051f)
                curveTo(11.5037f, 0.7078f, 12.7674f, 2.155f, 12.7674f, 3.6675f)
                verticalLineTo(5.8025f)
                curveTo(14.6612f, 6.1665f, 16.0933f, 7.8529f, 16.0933f, 9.8783f)
                verticalLineTo(13.9999f)
                curveTo(16.0933f, 16.2911f, 14.2608f, 18.1484f, 12.0002f, 18.1484f)
                curveTo(9.7397f, 18.1484f, 7.9072f, 16.2911f, 7.9072f, 13.9999f)
                verticalLineTo(9.8783f)
                curveTo(7.9072f, 7.8531f, 9.339f, 6.1668f, 11.2326f, 5.8026f)
                verticalLineTo(3.6675f)
                curveTo(11.2326f, 2.9023f, 10.6454f, 2.4599f, 10.1182f, 2.567f)
                curveTo(5.7922f, 3.4459f, 2.5349f, 7.2986f, 2.5349f, 11.9161f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9072f, 13.9537f)
                curveTo(7.9072f, 16.2449f, 9.7397f, 18.1023f, 12.0002f, 18.1023f)
                curveTo(14.2608f, 18.1023f, 16.0933f, 16.2449f, 16.0933f, 13.9537f)
                verticalLineTo(10.5831f)
                horizontalLineTo(7.9072f)
                verticalLineTo(13.9537f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7677f, 9.3382f)
                horizontalLineTo(16.0214f)
                curveTo(15.7094f, 7.6708f, 14.4128f, 6.0458f, 12.7677f, 5.7295f)
                verticalLineTo(9.3382f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2328f, 9.3382f)
                verticalLineTo(5.7295f)
                curveTo(9.5877f, 6.0458f, 8.2911f, 7.6708f, 7.9791f, 9.3382f)
                horizontalLineTo(11.2328f)
                close()
            }
        }
        .build()
        return _mouseCircle!!
    }

private var _mouseCircle: ImageVector? = null
