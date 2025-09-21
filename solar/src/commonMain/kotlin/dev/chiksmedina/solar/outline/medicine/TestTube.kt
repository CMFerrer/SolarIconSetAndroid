package dev.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.TestTube: ImageVector
    get() {
        if (_testTube != null) {
            return _testTube!!
        }
        _testTube = Builder(
            name = "TestTube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.2945f, 1.3544f)
                curveTo(8.9379f, 1.1436f, 8.478f, 1.2618f, 8.2672f, 1.6183f)
                curveTo(8.0564f, 1.9749f, 8.1746f, 2.4348f, 8.5311f, 2.6456f)
                lineTo(8.7271f, 2.7614f)
                lineTo(2.002f, 14.3695f)
                curveTo(0.4533f, 17.0427f, 1.3734f, 20.4596f, 4.053f, 22.0014f)
                curveTo(6.7312f, 23.5423f, 10.1569f, 22.6289f, 11.7047f, 19.9573f)
                lineTo(18.4334f, 8.343f)
                lineTo(18.6258f, 8.4537f)
                curveTo(18.9848f, 8.6604f, 19.4433f, 8.5369f, 19.65f, 8.1779f)
                curveTo(19.8566f, 7.8189f, 19.7331f, 7.3604f, 19.3742f, 7.1537f)
                lineTo(18.5336f, 6.6699f)
                lineTo(10.1262f, 1.846f)
                lineTo(9.2945f, 1.3544f)
                close()
                moveTo(3.2999f, 15.1214f)
                lineTo(10.0233f, 3.5164f)
                lineTo(17.1329f, 7.5956f)
                lineTo(15.6279f, 10.1933f)
                lineTo(13.718f, 9.0944f)
                curveTo(13.359f, 8.8879f, 12.9005f, 9.0114f, 12.6939f, 9.3705f)
                curveTo(12.4873f, 9.7295f, 12.6109f, 10.188f, 12.97f, 10.3946f)
                lineTo(14.876f, 11.4912f)
                lineTo(13.9145f, 13.1508f)
                lineTo(10.3597f, 11.1055f)
                curveTo(10.0007f, 10.8989f, 9.5421f, 11.0225f, 9.3356f, 11.3815f)
                curveTo(9.129f, 11.7406f, 9.2526f, 12.1991f, 9.6116f, 12.4056f)
                lineTo(13.1626f, 14.4487f)
                lineTo(12.277f, 15.9773f)
                lineTo(10.3124f, 14.847f)
                curveTo(9.9534f, 14.6404f, 9.4949f, 14.764f, 9.2883f, 15.1231f)
                curveTo(9.0817f, 15.4821f, 9.2053f, 15.9406f, 9.5643f, 16.1472f)
                lineTo(11.525f, 17.2752f)
                lineTo(10.4068f, 19.2053f)
                curveTo(9.2746f, 21.1595f, 6.7648f, 21.8311f, 4.8011f, 20.7012f)
                curveTo(2.8389f, 19.5723f, 2.1686f, 17.0741f, 3.2999f, 15.1214f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.1752f, 12.1014f)
                curveTo(20.5324f, 11.4232f, 19.4675f, 11.4232f, 18.8247f, 12.1014f)
                curveTo(18.5172f, 12.426f, 18.1419f, 12.8566f, 17.8388f, 13.3157f)
                curveTo(17.5544f, 13.7466f, 17.25f, 14.3242f, 17.25f, 14.9166f)
                curveTo(17.25f, 16.4522f, 18.4526f, 17.7499f, 20.0f, 17.7499f)
                curveTo(21.5473f, 17.7499f, 22.75f, 16.4522f, 22.75f, 14.9166f)
                curveTo(22.75f, 14.3242f, 22.4456f, 13.7466f, 22.1612f, 13.3157f)
                curveTo(21.8581f, 12.8566f, 21.4828f, 12.426f, 21.1752f, 12.1014f)
                close()
                moveTo(19.9135f, 13.1333f)
                curveTo(19.9428f, 13.1024f, 19.9734f, 13.0928f, 20.0f, 13.0928f)
                curveTo(20.0266f, 13.0928f, 20.0572f, 13.1024f, 20.0865f, 13.1333f)
                curveTo(20.3651f, 13.4272f, 20.6744f, 13.7862f, 20.9093f, 14.1421f)
                curveTo(21.1629f, 14.5263f, 21.25f, 14.7891f, 21.25f, 14.9166f)
                curveTo(21.25f, 15.6821f, 20.6618f, 16.2499f, 20.0f, 16.2499f)
                curveTo(19.3382f, 16.2499f, 18.75f, 15.6821f, 18.75f, 14.9166f)
                curveTo(18.75f, 14.7891f, 18.8371f, 14.5263f, 19.0907f, 14.1421f)
                curveTo(19.3256f, 13.7862f, 19.6349f, 13.4272f, 19.9135f, 13.1333f)
                close()
            }
        }
            .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
