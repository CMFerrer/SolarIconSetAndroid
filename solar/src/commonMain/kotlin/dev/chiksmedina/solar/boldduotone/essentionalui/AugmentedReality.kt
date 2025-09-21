package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.AugmentedReality: ImageVector
    get() {
        if (_augmentedReality != null) {
            return _augmentedReality!!
        }
        _augmentedReality = Builder(
            name = "AugmentedReality", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                pathFillType = EvenOdd
            ) {
                moveTo(14.0002f, 7.25f)
                curveTo(13.586f, 7.25f, 13.2502f, 7.5858f, 13.2502f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(13.2502f, 16.4142f, 13.586f, 16.75f, 14.0002f, 16.75f)
                curveTo(14.4144f, 16.75f, 14.7502f, 16.4142f, 14.7502f, 16.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(15.0845f)
                lineTo(17.3642f, 16.3975f)
                curveTo(17.5837f, 16.7488f, 18.0464f, 16.8555f, 18.3977f, 16.636f)
                curveTo(18.749f, 16.4165f, 18.8557f, 15.9538f, 18.6362f, 15.6025f)
                lineTo(16.7828f, 12.637f)
                curveTo(17.9203f, 12.3f, 18.7502f, 11.2469f, 18.7502f, 10.0f)
                curveTo(18.7502f, 8.4812f, 17.519f, 7.25f, 16.0002f, 7.25f)
                horizontalLineTo(14.0002f)
                close()
                moveTo(14.7502f, 8.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.0002f)
                curveTo(16.6906f, 11.25f, 17.2502f, 10.6904f, 17.2502f, 10.0f)
                curveTo(17.2502f, 9.3096f, 16.6906f, 8.75f, 16.0002f, 8.75f)
                horizontalLineTo(14.7502f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.2161f, 7.7763f)
                curveTo(9.1182f, 7.4632f, 8.8282f, 7.25f, 8.5002f, 7.25f)
                curveTo(8.1722f, 7.25f, 7.8822f, 7.4632f, 7.7843f, 7.7763f)
                lineTo(5.2843f, 15.7763f)
                curveTo(5.1608f, 16.1717f, 5.3811f, 16.5923f, 5.7765f, 16.7159f)
                curveTo(6.1719f, 16.8394f, 6.5925f, 16.6191f, 6.7161f, 16.2237f)
                lineTo(7.4266f, 13.95f)
                horizontalLineTo(9.5738f)
                lineTo(10.2843f, 16.2237f)
                curveTo(10.4079f, 16.6191f, 10.8285f, 16.8394f, 11.2239f, 16.7159f)
                curveTo(11.6193f, 16.5923f, 11.8396f, 16.1717f, 11.7161f, 15.7763f)
                lineTo(9.2161f, 7.7763f)
                close()
                moveTo(7.8953f, 12.45f)
                horizontalLineTo(9.1051f)
                lineTo(8.5002f, 10.5145f)
                lineTo(7.8953f, 12.45f)
                close()
            }
        }
            .build()
        return _augmentedReality!!
    }

private var _augmentedReality: ImageVector? = null
