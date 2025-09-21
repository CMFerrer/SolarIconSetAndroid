package dev.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.BarChair: ImageVector
    get() {
        if (_barChair != null) {
            return _barChair!!
        }
        _barChair = Builder(
            name = "BarChair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.9362f, 2.9946f)
                curveTo(12.9929f, 2.6685f, 11.007f, 2.6685f, 9.0638f, 2.9946f)
                lineTo(8.6662f, 3.0613f)
                curveTo(6.8089f, 3.3731f, 5.5527f, 5.0481f, 5.7758f, 6.8451f)
                lineTo(5.7938f, 6.9903f)
                curveTo(5.8107f, 7.1262f, 5.9346f, 7.25f, 6.1072f, 7.25f)
                horizontalLineTo(8.984f)
                curveTo(8.9942f, 7.2498f, 9.0043f, 7.2498f, 9.0145f, 7.25f)
                horizontalLineTo(14.9855f)
                curveTo(14.9957f, 7.2498f, 15.0058f, 7.2498f, 15.0159f, 7.25f)
                horizontalLineTo(17.8928f)
                curveTo(18.0654f, 7.25f, 18.1893f, 7.1262f, 18.2062f, 6.9903f)
                lineTo(18.2242f, 6.8451f)
                lineTo(18.9685f, 6.9375f)
                lineTo(18.2242f, 6.8451f)
                curveTo(18.4473f, 5.0481f, 17.1911f, 3.3731f, 15.3338f, 3.0613f)
                lineTo(14.9362f, 2.9946f)
                close()
                moveTo(15.9277f, 8.75f)
                horizontalLineTo(17.8928f)
                curveTo(18.7976f, 8.75f, 19.5816f, 8.0864f, 19.6948f, 7.1751f)
                lineTo(18.9505f, 7.0827f)
                lineTo(19.6948f, 7.1751f)
                lineTo(19.7128f, 7.0299f)
                curveTo(20.0381f, 4.409f, 18.2051f, 2.0223f, 15.5821f, 1.582f)
                lineTo(15.1845f, 1.5153f)
                curveTo(13.0768f, 1.1616f, 10.9231f, 1.1616f, 8.8155f, 1.5153f)
                lineTo(8.4179f, 1.582f)
                curveTo(5.7949f, 2.0223f, 3.9619f, 4.409f, 4.2872f, 7.0299f)
                lineTo(4.3052f, 7.1751f)
                curveTo(4.4184f, 8.0864f, 5.2023f, 8.75f, 6.1072f, 8.75f)
                horizontalLineTo(8.0723f)
                lineTo(6.4012f, 16.5484f)
                curveTo(6.3063f, 16.674f, 6.25f, 16.8304f, 6.25f, 17.0f)
                curveTo(6.25f, 17.0574f, 6.2564f, 17.1132f, 6.2686f, 17.1669f)
                lineTo(5.2666f, 21.8429f)
                curveTo(5.1799f, 22.2479f, 5.4378f, 22.6466f, 5.8428f, 22.7334f)
                curveTo(6.2479f, 22.8201f, 6.6466f, 22.5622f, 6.7333f, 22.1571f)
                lineTo(7.6777f, 17.75f)
                horizontalLineTo(16.3222f)
                lineTo(17.2666f, 22.1571f)
                curveTo(17.3534f, 22.5622f, 17.7521f, 22.8201f, 18.1571f, 22.7334f)
                curveTo(18.5622f, 22.6466f, 18.8201f, 22.2479f, 18.7333f, 21.8429f)
                lineTo(17.7314f, 17.1669f)
                curveTo(17.7435f, 17.1132f, 17.75f, 17.0574f, 17.75f, 17.0f)
                curveTo(17.75f, 16.8304f, 17.6937f, 16.674f, 17.5988f, 16.5484f)
                lineTo(15.9277f, 8.75f)
                close()
                moveTo(14.3937f, 8.75f)
                horizontalLineTo(9.6063f)
                lineTo(7.9992f, 16.25f)
                horizontalLineTo(16.0008f)
                lineTo(14.3937f, 8.75f)
                close()
            }
        }
            .build()
        return _barChair!!
    }

private var _barChair: ImageVector? = null
