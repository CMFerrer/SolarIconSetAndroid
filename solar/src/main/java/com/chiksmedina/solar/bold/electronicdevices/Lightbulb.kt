package com.chiksmedina.solar.bold.electronicdevices

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
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 2.0f)
                curveTo(7.3579f, 2.0f, 4.0f, 5.4359f, 4.0f, 9.6744f)
                curveTo(4.0f, 11.9468f, 4.966f, 13.9892f, 6.4986f, 15.3934f)
                curveTo(7.0094f, 15.8614f, 7.3878f, 16.2082f, 7.656f, 16.4598f)
                curveTo(7.7901f, 16.5855f, 7.8926f, 16.6838f, 7.9683f, 16.7592f)
                curveTo(8.006f, 16.7968f, 8.0349f, 16.8266f, 8.0563f, 16.8496f)
                curveTo(8.067f, 16.861f, 8.075f, 16.8699f, 8.0808f, 16.8766f)
                curveTo(8.0865f, 16.8831f, 8.0892f, 16.8864f, 8.0892f, 16.8864f)
                curveTo(8.3257f, 17.1851f, 8.3769f, 17.2622f, 8.4074f, 17.332f)
                curveTo(8.4379f, 17.4018f, 8.4598f, 17.4922f, 8.5195f, 17.8717f)
                curveTo(8.543f, 18.0216f, 8.5455f, 18.2782f, 8.5455f, 18.9767f)
                lineTo(8.5455f, 19.0067f)
                curveTo(8.5454f, 19.4158f, 8.5454f, 19.7687f, 8.5711f, 20.0583f)
                curveTo(8.5982f, 20.3645f, 8.6582f, 20.6677f, 8.8195f, 20.9535f)
                curveTo(8.999f, 21.2717f, 9.2572f, 21.5359f, 9.5682f, 21.7196f)
                curveTo(9.8475f, 21.8846f, 10.1438f, 21.946f, 10.443f, 21.9738f)
                curveTo(10.726f, 22.0f, 11.0709f, 22.0f, 11.4707f, 22.0f)
                horizontalLineTo(11.5293f)
                curveTo(11.9291f, 22.0f, 12.274f, 22.0f, 12.557f, 21.9738f)
                curveTo(12.8562f, 21.946f, 13.1525f, 21.8846f, 13.4318f, 21.7196f)
                curveTo(13.7428f, 21.5359f, 14.001f, 21.2717f, 14.1805f, 20.9535f)
                curveTo(14.3418f, 20.6677f, 14.4018f, 20.3645f, 14.4289f, 20.0583f)
                curveTo(14.4546f, 19.7687f, 14.4546f, 19.4158f, 14.4545f, 19.0067f)
                verticalLineTo(18.9767f)
                curveTo(14.4545f, 18.2782f, 14.457f, 18.0216f, 14.4805f, 17.8717f)
                curveTo(14.5402f, 17.4922f, 14.5621f, 17.4018f, 14.5926f, 17.332f)
                curveTo(14.6231f, 17.2622f, 14.6743f, 17.1851f, 14.9108f, 16.8864f)
                curveTo(14.9108f, 16.8864f, 14.9118f, 16.8852f, 14.914f, 16.8826f)
                curveTo(14.914f, 16.8826f, 14.917f, 16.8791f, 14.9192f, 16.8766f)
                curveTo(14.925f, 16.8699f, 14.933f, 16.861f, 14.9436f, 16.8496f)
                curveTo(14.9651f, 16.8266f, 14.994f, 16.7968f, 15.0317f, 16.7592f)
                curveTo(15.1074f, 16.6838f, 15.2099f, 16.5855f, 15.344f, 16.4598f)
                curveTo(15.6122f, 16.2082f, 15.9906f, 15.8614f, 16.5014f, 15.3934f)
                curveTo(18.034f, 13.9892f, 19.0f, 11.9468f, 19.0f, 9.6744f)
                curveTo(19.0f, 5.4359f, 15.6421f, 2.0f, 11.5f, 2.0f)
                close()
                moveTo(13.0709f, 19.9323f)
                curveTo(13.0776f, 19.8561f, 13.0821f, 19.7714f, 13.0851f, 19.6744f)
                horizontalLineTo(9.9149f)
                curveTo(9.9179f, 19.7714f, 9.9224f, 19.8561f, 9.9291f, 19.9323f)
                curveTo(9.9477f, 20.1418f, 9.979f, 20.2178f, 10.0004f, 20.2558f)
                curveTo(10.0603f, 20.3619f, 10.1463f, 20.4499f, 10.25f, 20.5112f)
                curveTo(10.2871f, 20.5331f, 10.3615f, 20.5651f, 10.5661f, 20.5841f)
                curveTo(10.7802f, 20.604f, 11.0626f, 20.6047f, 11.5f, 20.6047f)
                curveTo(11.9374f, 20.6047f, 12.2198f, 20.604f, 12.4339f, 20.5841f)
                curveTo(12.6385f, 20.5651f, 12.7129f, 20.5331f, 12.75f, 20.5112f)
                curveTo(12.8537f, 20.4499f, 12.9397f, 20.3619f, 12.9996f, 20.2558f)
                curveTo(13.021f, 20.2178f, 13.0523f, 20.1418f, 13.0709f, 19.9323f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.2738f, 13.3508f)
                curveTo(9.6323f, 13.1434f, 10.0911f, 13.2659f, 10.2985f, 13.6245f)
                curveTo(10.5158f, 14.0f, 10.92f, 14.25f, 11.3817f, 14.25f)
                curveTo(11.8435f, 14.25f, 12.2477f, 14.0f, 12.465f, 13.6245f)
                curveTo(12.6724f, 13.2659f, 13.1312f, 13.1434f, 13.4897f, 13.3508f)
                curveTo(13.8483f, 13.5582f, 13.9708f, 14.017f, 13.7634f, 14.3755f)
                curveTo(13.4101f, 14.9862f, 12.8271f, 15.4496f, 12.1317f, 15.6464f)
                verticalLineTo(17.0f)
                curveTo(12.1317f, 17.4142f, 11.7959f, 17.75f, 11.3817f, 17.75f)
                curveTo(10.9675f, 17.75f, 10.6317f, 17.4142f, 10.6317f, 17.0f)
                verticalLineTo(15.6464f)
                curveTo(9.9363f, 15.4496f, 9.3534f, 14.9862f, 9.0001f, 14.3755f)
                curveTo(8.7927f, 14.017f, 8.9152f, 13.5582f, 9.2738f, 13.3508f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
