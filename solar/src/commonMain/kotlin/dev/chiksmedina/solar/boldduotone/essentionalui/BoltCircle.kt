package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.BoltCircle: ImageVector
    get() {
        if (_boltCircle != null) {
            return _boltCircle!!
        }
        _boltCircle = Builder(
            name = "BoltCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.2274f, 8.569f)
                lineTo(9.2124f, 10.1737f)
                curveTo(8.367f, 10.8469f, 7.9442f, 11.1836f, 8.0267f, 11.5594f)
                lineTo(8.0311f, 11.578f)
                curveTo(8.1251f, 11.9515f, 8.661f, 12.0951f, 9.7326f, 12.3823f)
                curveTo(10.3281f, 12.5418f, 10.6259f, 12.6216f, 10.7656f, 12.8473f)
                lineTo(10.7727f, 12.8592f)
                curveTo(10.9075f, 13.0876f, 10.8308f, 13.3737f, 10.6775f, 13.9459f)
                lineTo(10.6374f, 14.0954f)
                lineTo(10.6374f, 14.0954f)
                curveTo(10.2123f, 15.6818f, 9.9998f, 16.4749f, 10.4091f, 16.7311f)
                curveTo(10.8184f, 16.9872f, 11.4697f, 16.4686f, 12.7722f, 15.4314f)
                lineTo(12.7723f, 15.4314f)
                lineTo(14.7873f, 13.8267f)
                curveTo(15.6327f, 13.1535f, 16.0554f, 12.8169f, 15.9729f, 12.441f)
                lineTo(15.9686f, 12.4224f)
                curveTo(15.8745f, 12.0489f, 15.3387f, 11.9053f, 14.2671f, 11.6182f)
                curveTo(13.6716f, 11.4586f, 13.3738f, 11.3788f, 13.2341f, 11.1531f)
                lineTo(13.227f, 11.1412f)
                curveTo(13.0922f, 10.9128f, 13.1689f, 10.6267f, 13.3222f, 10.0546f)
                lineTo(13.3623f, 9.905f)
                curveTo(13.7873f, 8.3186f, 13.9999f, 7.5255f, 13.5905f, 7.2693f)
                curveTo(13.1812f, 7.0132f, 12.5299f, 7.5318f, 11.2274f, 8.569f)
                close()
            }
        }
            .build()
        return _boltCircle!!
    }

private var _boltCircle: ImageVector? = null
